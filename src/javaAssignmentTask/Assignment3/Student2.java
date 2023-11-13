package javaAssignmentTask.Assignment3;

public class Student2 {
    protected String studentName; //protected variable
    public long studentID; //public variable
    char section; //default
    String address;
    //private int numberOfSection;

    public Student2(){

    }
    public void getStudentMail(String studentMail){ //public access modifier
        System.out.println("Student Mail is : "+studentMail);
    }
    private void studentAddress(){ //private
        System.out.println("Student address is "+address);
    }
    protected char studentSection(){ //protected modifier
        return section;
    }
    long studentPhone(long phoneNumber){ //default
        return phoneNumber;
    }
}
