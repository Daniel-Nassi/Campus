public class Course {
    private String courseName;
    private double grade;

    //פעולה בונה
    public Course(String courseName, double grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    //פעולה של to string
    @Override
    public String toString() {
        return "Course [CourseName=" + courseName + ", Grade=" + grade + "]";
    }

    //פעולה המחזירה את הציון
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        grade = grade;
    }

    //פעולה המחזירה את שם הקורס
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        courseName = courseName;
    }
}