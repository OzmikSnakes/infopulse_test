package task3;

import task3.abstracts.Person;

import java.util.Date;

public class Student extends Person {

    public Student(String name, Sex sex, Date dob) {
        super(name, sex, dob);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
