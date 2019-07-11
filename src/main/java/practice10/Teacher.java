package practice10;


import java.util.Iterator;
import java.util.LinkedList;

public class Teacher extends Person {

   public LinkedList<Klass> classes;
    public Teacher(String name, int age) {
        super(name, age);

    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(String name, int age, LinkedList<Klass> classes) {
        super(name, age);
        this.classes = classes;
    }



    @Override
    public String introduce() {

        if(this.classes==null){
              return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        String s=super.introduce()+" I am a Teacher. I teach Class ";
        int a=0;
        for(Iterator iter = classes.iterator(); iter.hasNext();){
            if (a == 0) {
                a=1;
            }else {
                s+=", ";
            }

            Klass klass=(Klass) iter.next();
            s+=klass.number;
        }
        s += ".";
        return s;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public String introduceWith(Student student){
        boolean isTeach=false;
        for(Iterator iter = classes.iterator(); iter.hasNext();){
            Klass klass=(Klass) iter.next();
            if (klass.number==student.getKlass().number) {
                isTeach=true;
                break;
            }
        }
        if (isTeach) {
            return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.name+".";
    }
    public boolean isTeaching(Student student){
        boolean isTeach=false;
        for(Iterator iter = classes.iterator(); iter.hasNext();){
            Klass klass=(Klass) iter.next();
            if (klass.isIn(student)) {
                isTeach=true;
                break;
            }
        }
        return isTeach;

    }

}
