package task3.abstracts;

import java.util.Date;
import java.util.Objects;

public abstract class Person {

    private final Date dob;
    private String name;
    private Sex sex;

    public Person(String name, Sex sex, Date dob) {
        this.name = name;
        this.sex = sex;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dob, person.dob) &&
                Objects.equals(name, person.name) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dob, name, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "dob=" + dob +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public enum Sex {
        MALE,
        FEMALE,
        OTHER
    }
}
