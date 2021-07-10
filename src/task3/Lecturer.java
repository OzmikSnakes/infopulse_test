package task3;

import task3.abstracts.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Lecturer extends Person {

    private final ArrayList<Subject> subjects;

    public Lecturer(String name, Sex sex, Date dob, ArrayList<Subject> subjects) {
        super(name, sex, dob);
        this.subjects = subjects;
    }

    public ArrayList<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public boolean removeSubject(Subject subject) {
        return subjects.remove(subject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lecturer lecturer = (Lecturer) o;
        return super.equals(lecturer) && Objects.equals(subjects, lecturer.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subjects);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
