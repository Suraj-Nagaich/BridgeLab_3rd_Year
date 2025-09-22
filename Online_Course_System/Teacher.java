package Online_Course_System;
class Teacher extends User {
    private String subject;
    public Teacher(int userId, String name, String subject) {
        super(userId, name);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
}