package beginnerCourse.entities;

public class Course {
    private int courseId; // Kurs Kodu
    String courseName; // Kursun Adı
    int educationTime; //  Eğitim Süresi
    String courseInfo; // Kurs Bilgisi
    int coursePrice; // Kurs Ücreti


    public Course() {
    }

    public Course(int courseId, String courseName, int educationTime, String courseInfo, int coursePrice) {
        this.courseId=courseId;
        this.courseName = courseName;
        this.educationTime = educationTime;
        this.courseInfo = courseInfo;
        this.coursePrice = coursePrice;


    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getEducationTime() {
        return educationTime;
    }

    public void setEducationTime(int educationTime) {
        this.educationTime = educationTime;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
