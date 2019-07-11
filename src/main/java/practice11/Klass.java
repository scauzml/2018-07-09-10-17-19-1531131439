package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Klass {
    public int number;
    public Student Leader;
    public List<Student> member=new ArrayList<>();
    public List<Teacher> observer=new ArrayList<>();
    public String addStudetName;
    public String addLeaderName;

    public List<Teacher> getObserver() {
        return observer;
    }

    public void setObserver(List<Teacher> observer) {
        this.observer = observer;
    }

    public String getAddLeaderName() {
        return addLeaderName;

    }

    public void setAddLeaderName(String addLeaderName) {
        this.addLeaderName = addLeaderName;
        notifyAllObservers();
        this.addLeaderName=null;
    }

    public String getAddStudetName() {
        return addStudetName;
    }

    public void setAddStudetName(String addStudetName) {
        this.addStudetName = addStudetName;
        notifyAllObservers();
        this.addStudetName=null;
    }

    public List<Student> getMember() {
        return member;
    }

    public void setMember(List<Student> member) {
        this.member = member;
    }

    public Klass(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return Leader;
    }

    public void setLeader(Student leader) {
        Leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student) {
        boolean isInClass=false;
        for (Student s:member
             ) {
            if (s.id == student.id) {
                isInClass=true;
                break;
            }
        }
        if (isInClass) {
            this.Leader=student;
            this.setAddLeaderName(student.name);
        }else {
            System.out.print("It is not one of us.\n");
        }


    }
    public void appendMember(Student student) {
        member.add(student);
        this.setAddStudetName(student.name);
    }

    public boolean isIn(Student student) {
        boolean flag=false;

            if (this.number == student.klass.number) {
                flag=true;

        }
        return flag;
    }

    public void attach(Teacher teacher) {
        observer.add(teacher);

    }

    public void notifyAllObservers() {
        for (Teacher o : observer) {
            o.update();
        }
    }
}
