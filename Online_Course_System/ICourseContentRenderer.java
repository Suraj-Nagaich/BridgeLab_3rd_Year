package Online_Course_System;
interface CourseContentRenderer {
    void renderContent(String content);
}
class VideoRenderer implements CourseContentRenderer {
    public void renderContent(String content) {
        System.out.println(" Playing video: " + content);
    }
}
class PDFRenderer implements CourseContentRenderer {
    public void renderContent(String content) {
        System.out.println(" Displaying PDF: " + content);
    }
}

class HTMLRenderer implements CourseContentRenderer {
    public void renderContent(String content) {
        System.out.println(" Rendering HTML Page: " + content);
    }
}
