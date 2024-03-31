import java.util.Arrays;

// Student class
class Student {
    private String nameStudent;
    private Date dateOfBirth;
    private int numOfLearnInDay;
    private Course[] courses;
    private int courseCount;

    //פעולה בונה
    public Student(String nameStudent, Date dateOfBirth, int numOfLearnInDay) {
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.numOfLearnInDay = numOfLearnInDay;
        this.courses = new Course[this.numOfLearnInDay];
        this.courseCount = 0;
    }
    //פעולה המחזירה את שם התלמיד
    public String getNameStudent() {
        return nameStudent;
    }
    //פעולה המחזירה את תאריך הלידה
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    //פעולה המחזירה את מספר ימי הלימוד
    public int getNumOfLearnInDay() {
        return numOfLearnInDay;
    }
    //פעולת -addcourse
    public void addCourse(Course course) {
        if (courseCount < numOfLearnInDay) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println(course.getCourseName() + " added successfully.");
        } else {
            System.out.println("Course " + course.getCourseName() + " was not added because the student has no free days.");
        }
    }
    //פעולת ShowCourses
    public void showCourses() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].toString());
        }
    }
    //פעולת Average
    public double average() {
        double avg = 0;
        for (int i = 0; i < courses.length; i++) {
            avg += courses[i].getGrade();
        }
        return avg / courses.length;
    }
    //פעולת BirthDay
    public boolean birthday(Date d) {
        return dateOfBirth.equals(d);
    }
    //פעולת registered
    public boolean registered(String courseName) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseName().equals(courseName)) {
                return true;
            }
        }
        return false;
    }

    //פעולת to string
    @Override
    public String toString() {
        return "Student [NameStudent=" + nameStudent + ", DateBorn=" + dateOfBirth + ", NumOfLearnInDay=" + numOfLearnInDay + ", course:="
                + Arrays.toString(courses) + "]";
    }
}
