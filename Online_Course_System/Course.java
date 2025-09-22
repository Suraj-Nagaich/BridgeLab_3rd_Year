package Online_Course_System;

import java.util.*;

class Course {
    private String courseName;
    private Teacher instructor;
    private List<Student> students;
    public Course(String courseName, Teacher instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new ArrayList<>();
    }

    public Course(String courseName) { 
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignTeacher(Teacher teacher) {
        this.instructor = teacher;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }
    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (instructor != null)
            System.out.println("Instructor: " + instructor.getName() + " (" + instructor.getSubject() + ")");
        else
            System.out.println("Instructor: Not Assigned");

        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName() + " [Grade: " + s.getGradeLevel() + "]");
        }
    }
}