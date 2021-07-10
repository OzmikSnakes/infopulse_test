package task3;

import task3.abstracts.Department;

import java.util.ArrayList;
import java.util.Objects;

public class University extends Department {

    private final ArrayList<Faculty> faculties;
    private final ArrayList<Subject> subjects;

    public University(String name, ArrayList<Faculty> faculties, ArrayList<Subject> subjects) {
        super(name);
        this.faculties = faculties;
        this.subjects = subjects;
    }

    public ArrayList<Faculty> getFaculties() {
        return new ArrayList<>(faculties);
    }

    public ArrayList<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public boolean removeFaculty(Faculty faculty) {
        return faculties.remove(faculty);
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
        University that = (University) o;
        return getName().equals(that.getName()) && faculties.equals(that.faculties) &&
                subjects.equals(that.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), faculties, subjects);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
