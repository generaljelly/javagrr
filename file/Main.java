package file;
// student, course classes. name + id. student has more then course.
// write all students and courses into files
// display all courses for one student

import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        
        // initializing courses
        Course[] c = {
            new Course("Data Structures", 1),
            new Course("Advanced Programming", 2),
            new Course("Web Programming", 3)
        }; 
        // creating students
        /* 
        Student s = new Student();
        s.setName("person");
        s.setID(1);
        // set student course
        s.setCourse(new Course[] {c1, c2});
        s.getCourse();

        */
        // initializing "previous" students
        Student[] all = {
            new Student("Mary Jane", 2, new Course[] {c[0], c[1]}),
            new Student("Jack Green", 3, new Course[] {c[0], c[1], c[2]})
        };

        /* 
        System.out.println(all[0].getName());
        all[0].getCourse();
        System.out.println(all[1].getName());
        all[1].getCourse();
        */

        // Writing files for student and course class
        m.writeStudents(all);
        m.writeCourses(c);

        // display courses for specific student
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter full name: ");
        String namein = input.nextLine();
        System.out.println("Enter ID");
        int idin = input.nextInt();
 
        for (Student student: all) {
            if (namein.equals(student.getName()) && idin == student.getID()) {
                m.displayCourses(student);
                input.close();
                return;
            }
        }
        System.out.println("Incorrect name or id");
        input.close();
        return;
    }

    public void writeStudents(Student[] students) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file/students.txt"));
            bw.write(String.format("%-20s %s\n", "Student Name", "ID"));
            
            for (Student student : students) {
                bw.write(String.format("%-20s %s \n", student.getName(), student.getID()));
            }
            
            bw.close();
        } 
        catch(Exception E) {

        }
        
    }

    public void writeCourses(Course[] courses) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file/courses.txt"));
            bw.write(String.format("%-20s %s\n", "Course Name", "ID"));
            
            for (Course course : courses) {
                bw.write(String.format("%-20s %s \n", course.getName(), course.getID()));
            }
            
            bw.close();
        } 
        catch(Exception E) {

        }
    }

    public void displayCourses(Student student) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file/StudentCourses.txt"));
            bw.write(String.format("%-20s %s\n", "Course Name", "ID")); 
            Course[] stcourses = student.getCourse();
            for (Course course: stcourses) {
                bw.write(String.format("%-20s %s\n", course.getName(), course.getID()));
            }

            bw.close();
            
            BufferedReader br = new BufferedReader(new FileReader("file/StudentCourses.txt"));
            String s;
            System.out.print("Courses for ");
            System.out.println(student.getName());
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
        } catch (Exception E) {

        }
    }
}