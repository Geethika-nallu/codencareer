class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101);
        Course course1 = new Course("Java Programming", 6);

        System.out.println("=== Student Details ===");
        student1.display();

        System.out.println("\n=== Course Details ===");
        course1.display();
    }
}
