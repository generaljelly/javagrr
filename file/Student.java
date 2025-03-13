package file;
public class Student {
    private String name;
    private int id;
    private Course[] course;

    public Student(String name, int id, Course[] course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public Student() {
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

    void setCourse(Course[] course) {
        this.course = course;
    }

    Course[] getCourse() {
        return course;
    }
}