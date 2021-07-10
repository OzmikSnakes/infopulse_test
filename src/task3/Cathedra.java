package task3;

import task3.abstracts.Department;
import task3.exceptions.DatasetViolationException;
import task3.exceptions.IncompleteDatasetException;

import java.util.ArrayList;
import java.util.Objects;

public class Cathedra extends Department {

    private final ArrayList<Group> groups;
    private final ArrayList<Lecturer> lecturers;

    public Cathedra(String name, ArrayList<Group> groups, ArrayList<Lecturer> lecturers) throws IncompleteDatasetException {
        super(name);

        if (groups.size() < 1)
            throw new IncompleteDatasetException("Should be at least one group");
        if (lecturers.size() < 3)
            throw new IncompleteDatasetException("Should be at least three lecturers");

        this.groups = groups;
        this.lecturers = lecturers;
    }

    public ArrayList<Group> getGroups() {
        return new ArrayList<>(groups);
    }

    public ArrayList<Lecturer> getLecturers() {
        return new ArrayList<>(lecturers);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public boolean removeGroup(Group group) throws DatasetViolationException {
        if (groups.size() > 1)
            return groups.remove(group);
        else
            throw new DatasetViolationException("Cathedra should have at least one group");
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public boolean removeLecturer(Lecturer lecturer) throws DatasetViolationException {
        if (lecturers.size() > 1)
            return lecturers.remove(lecturer);
        else
            throw new DatasetViolationException("University should have at least three lecturers");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cathedra cathedra = (Cathedra) o;
        return getName().equals(cathedra.getName()) &&
                Objects.equals(groups, cathedra.groups) &&
                Objects.equals(lecturers, cathedra.lecturers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), groups, lecturers);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
