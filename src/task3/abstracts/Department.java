package task3.abstracts;

public abstract class Department {

    private String name;

    public Department(String name) {
        if (name != null)
            this.name = name;
        else
            throw new NullPointerException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
        else
            throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name;
    }
}
