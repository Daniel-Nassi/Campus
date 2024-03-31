import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static final int NUM_STUDENT = 5;
    public static Student[] sortStudentsByBirthDate(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.getDateOfBirth().compareTo(s2.getDateOfBirth()));
        return students;
    }

    public static double calculateAverageGrade(Student[] students) {
        double totalGrade = 0;
        int count = 0;

        for (Student student : students) {
            // Assuming each student has a method to get their average grade
            totalGrade += student.average();
            count++;
        }

        return totalGrade / count;
    }

    public static void printStudentsWithBirthday(Student[] students, Date date) {
        for (Student student : students) {
            if (student.birthday(date)) {
                System.out.println(student.getNameStudent() + " has a birthday on " + date.toString());
            }
        }
    }

    public static void printNumberOfStudentsInCourse(Student[] students, String courseName) {
        int count = 0;

        for (Student student : students) {
            if (student.registered(courseName)) {
                count++;
            }
        }

        System.out.println("Number of students participating in course " + courseName + ": " + count);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[NUM_STUDENT];

        for (int i = 0; i < NUM_STUDENT; i++) {
            System.out.println("Enter student details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Day of birth: ");
            int day = scanner.nextInt();
            System.out.print("Month of birth: ");
            int month = scanner.nextInt();
            System.out.print("Year of birth: ");
            int year = scanner.nextInt();
            System.out.print("Number of school days per week: ");
            int numOfLearnInDay = scanner.nextInt();

            students[i] = new Student(name, new Date(day, month, year), numOfLearnInDay);

            scanner.nextLine(); // Consume newline
            for (int j = 0; j < numOfLearnInDay; j++) {
                System.out.print("Enter course name for day " + (j + 1) + ": ");
                String course = scanner.nextLine();
                System.out.print("Enter grade for course " + course + ": ");
                // Assuming you have a method to set grades for courses
                int grade = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                students[i].addCourse(new Course(course, grade));


            }
        }
        // Sort students by birth date
        Student[] sortedStudents = Program.sortStudentsByBirthDate(students);

        // Calculate average grade of all students
        double averageGrade = Program.calculateAverageGrade(students);
        System.out.println("Average grade of all students: " + averageGrade);

        // Get current date to check for student birthdays
        Date currentDate = new Date();

        // Print students with birthdays today
        Program.printStudentsWithBirthday(students, currentDate);

        // Get course name to find number of students participating
        System.out.print("Enter course name to check number of participants: ");
        String courseToCheck = scanner.nextLine();
        Program.printNumberOfStudentsInCourse(students, courseToCheck);
    }

}