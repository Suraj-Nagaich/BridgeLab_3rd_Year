package Online_Course_System;
public class Student extends User {
    private String gradeLevel;
    public Student(int userId, String name, String gradeLevel) {
        super(userId, name); 
        this.gradeLevel = gradeLevel;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
}
