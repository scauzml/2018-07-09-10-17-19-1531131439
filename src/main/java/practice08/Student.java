package practice08;



public class Student extends Person {
     public Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(String name, int age, int id, Klass klass) {
        super(name, age, id);
        this.klass = klass;
    }
    public Student( int id, String name, int age,Klass klass) {
        super(name, age, id);
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
        if (this.klass.getLeader()==this) {
            return super.introduce()+" I am a Student. I am Leader of Class "+this.klass.number+".";
        }
        return super.introduce()+" I am a Student. I am at Class "+this.klass.number+".";
    }
}
