package file;
public class Course {
    private String name;
    private int id;

    public Course(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Course() {
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setID(int id) {
        this.id = id;
    }

    int getID() {
        return id;
    }
}