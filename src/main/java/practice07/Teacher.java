package practice07;

import practice06.Person;

public class Teacher extends Person{
    public Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass==null){
              return super.introduce()+" I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" I am a Teacher. I teach Class "+this.klass.number+".";
    }
    public String introduceWith(Student student){
        if (student.klass.number == this.klass.number) {
            return super.introduce()+" I am a Teacher. I teach "+student.name+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.name+".";
    }
}
