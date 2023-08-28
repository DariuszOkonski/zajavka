package java_A_Z.section11.ex2;

public class AccessCard implements Comparable<AccessCard>{
    private String name;
    private int id;

    public AccessCard(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }

    @Override
    public int compareTo(AccessCard o) {
        return this.name.compareTo(o.getName());
    }
}
