package javaAssignmentTask.Assignment5;

public class VariableTask1 {
    public String studentName = "Lubaba"; //example of instance variable
    public String studentID = "12345678"; //example of instance variable

    public static int studentScholarship = 12000; //example of static variable


    public void studentCGPA() {
        double cgpa = 4.00; //example of local variable can be accessible within this method
        System.out.println("CGPA is: " + cgpa);
        System.out.println("Student ID is: " + studentID); //instance variable so can be called within the method
        System.out.println("Student Name is: " + studentName); //instance variable so can be called within the method
        System.out.println("Scholarship: " + studentScholarship); //static variable so can be called within the method

    }
    public void test(){
        System.out.println(studentID);
        //System.out.println(cgpa); //unable to print as it is a local variable
    }

}
