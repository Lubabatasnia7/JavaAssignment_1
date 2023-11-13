package javaAssignmentTask.Assignment3;

public class MainStudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.studentName = "Lubaba";
        s.studentID = 12345678;
        s.studentMail = "lubaba@gmail.com";
        s.semester = "Final Semester";
        s.dept = "CSE";
        System.out.println("Name is : " +s.studentName);
        System.out.println("ID is : " +s.studentID);
        System.out.println("Mail is : " +s.studentMail);
        System.out.println("Semester is : " +s.semester);
        s.printStudentDept();
        System.out.println(s.printSemester());

    }
}
