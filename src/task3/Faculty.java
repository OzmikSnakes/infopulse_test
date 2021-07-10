package task3;

import task3.abstracts.Department;
import task3.exceptions.DatasetViolationException;
import task3.exceptions.IncompleteDatasetException;

import java.util.ArrayList;
import java.util.Objects;

public class Faculty extends Department {

    private final ArrayList<Cathedra> cathedras;

    public Faculty(String name, ArrayList<Cathedra> cathedras) throws IncompleteDatasetException {
        super(name);

        if (cathedras.size() < 1)
            throw new IncompleteDatasetException("Should be at least one cathedra");

        this.cathedras = cathedras;
    }

    public ArrayList<Cathedra> getCathedras() {
        return new ArrayList<>(cathedras);
    }

    public void addCathedra(Cathedra cathedra) {
        cathedras.add(cathedra);
    }

    public boolean removeCathedra(Cathedra cathedra) throws DatasetViolationException {
        if (cathedras.size() > 1)
            return cathedras.remove(cathedra);
        else
            throw new DatasetViolationException("Faculty should have at least one cathedra");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty that = (Faculty) o;
        return getName().equals(that.getName()) && cathedras.equals(that.cathedras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), cathedras);
    }
}
