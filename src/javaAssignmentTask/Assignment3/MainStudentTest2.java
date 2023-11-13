package javaAssignmentTask.Assignment3;

public class MainStudentTest2 {
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.studentName = "Lubaba";
        s2.studentID = 123123123;
        s2.section = 'A';
        s2.address = "112/A flat3B, dhaka-1212";
        //s2.numberOfSection = 15;
        //private variable

        System.out.println("Student name is :"+s2.studentName);
        System.out.println("Student ID is :"+s2.studentID);
        s2.getStudentMail("lubaba97@gmail.com");
        //s2.studentAddress()
        //as it is a private modifier can not access
        System.out.println("Student section is : "+s2.studentSection());
        System.out.println("Student phone number is :"+s2.studentPhone(9876786));

    }
}
