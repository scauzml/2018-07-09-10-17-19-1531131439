package practice10;

import java.util.Objects;

public class Person {
    public String name;
    public int age;
    public int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Person(int id,String name, int age ) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getId() == person.getId() &&
                getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getId());
    }
}
