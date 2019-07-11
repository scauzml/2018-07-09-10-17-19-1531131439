package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public int number;
    public Student Leader;
    public List<Student> member=new ArrayList<>();

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
        }else {
            System.out.print("It is not one of us.\n");
        }

    }
    public void appendMember(Student student) {
        member.add(student);
    }

    public boolean isIn(Student student) {
        boolean flag=false;

            if (this.number == student.klass.number) {
                flag=true;

        }
        return flag;
    }
}
