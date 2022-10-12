package beginnerCourse.entities;

public class Instructor {
    private int instructorId; // Eğitmenin Kodu
    String educationFirstName; // Eğitmen Adı
    String educationLastName; // Eğitmen SoyAdı
    String educationInfo; // Eğitmen ile ilgili Bilgiler

    public Instructor() {
    }

    public Instructor(int instructorId,String  educationFirstName, String educationLastName, String educationInfo) {
        this.setInstructorId(instructorId);
        this.educationFirstName = educationFirstName;
        this.educationLastName = educationLastName;
        this.educationInfo = educationInfo;
    }

    public String getEducationFirstName() {
        return educationFirstName;
    }

    public void setEducationFirstName(String educationFirstName) {
        this.educationFirstName = educationFirstName;
    }

    public String getEducationLastName() {
        return educationLastName;
    }

    public void setEducationLastName(String educationLastName) {
        this.educationLastName = educationLastName;
    }

    public String getEducationInfo() {
        return educationInfo;
    }

    public void setEducationInfo(String educationInfo) {
        this.educationInfo = educationInfo;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
