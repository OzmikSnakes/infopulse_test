package task3;

import task3.abstracts.Department;
import task3.exceptions.DatasetViolationException;
import task3.exceptions.IncompleteDatasetException;

import java.util.ArrayList;
import java.util.Objects;

public class Group extends Department {

    private final String specialization;
    private final ArrayList<Student> students;
    private final ArrayList<Subject> subjects;
    private Lecturer curator;

    public Group(String name, String specialization, Lecturer curator,
                 ArrayList<Student> students, ArrayList<Subject> subjects) throws IncompleteDatasetException {
        super(name);
        this.specialization = specialization;
        this.curator = curator;
        this.subjects = subjects;

        if (students.size() < 6)
            throw new IncompleteDatasetException("Should be at least six students");

        this.students = students;
    }

    public String getSpecialization() {
        return specialization;
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public ArrayList<Subject> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public Lecturer getCurator() {
        return curator;
    }

    public void setCurator(Lecturer curator) {
        if (curator != null)
            this.curator = curator;
        else
            throw new NullPointerException();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(Student student) throws DatasetViolationException {
        if (students.size() > 6)
            return students.remove(student);
        else
            throw new DatasetViolationException("Group should have at least six students");
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
        Group group = (Group) o;
        return getName().equals(group.getName()) &&
                Objects.equals(specialization, group.specialization) &&
                Objects.equals(students, group.students) &&
                Objects.equals(subjects, group.subjects) &&
                Objects.equals(curator, group.curator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), specialization, students, subjects, curator);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
