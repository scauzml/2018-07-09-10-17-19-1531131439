package practice08;

public class Klass {
    public int number;
    public Student Leader;
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
        this.Leader=student;
    }
}
