package Online_Course_System;

public class Main {
	  public static void main(String[] args) {
	        Teacher t1 = new Teacher(101, "Dr.Ashish Sharma", "Design and Analysis of Algorithm");
	        Course course1 = new Course("Discrete Mathematics", t1);
	        Student s1 = new Student(201, "Suraj", "Grade 10");
	        Student s2 = new Student(202, "Govind", "Grade 8");
	        course1.enrollStudent(s1);
	        course1.enrollStudent(s2);
	        course1.showCourseDetails();
	        System.out.println("Course Content");
	        CourseContentRenderer video = new VideoRenderer();
	        video.renderContent("Discrete Mathematics.mp4");
	        CourseContentRenderer pdf = new PDFRenderer();
	        pdf.renderContent("Discrete Mathematics.pdf");
	        CourseContentRenderer html = new HTMLRenderer();
	        html.renderContent("Discrete Mathematics.html");
	    }
	}

