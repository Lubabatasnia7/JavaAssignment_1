package javaAssignmentTask.Assignment3;

public class Student {

    String studentName;
    long studentID;
    String studentMail;
    String semester;

    String dept;


    public Student(){

    }

    public void printStudentDept(){ //method with no return type
        System.out.println("Dept is: " +dept);
    }

    public String printSemester(){ // with return type
       return semester;
    }


}
