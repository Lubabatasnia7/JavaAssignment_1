package javaAssignmentTask.Assignment3;

public class Employee {
    String employeeName;
    long employeeID;
    String employeeEmail;
    int employeeDeskNumber;

    String employeeLocation;

    String employeeBloodGroup;
    int employeeLevel;

    String employeePhoneNumber;
    int employeeAge;


    public Employee(){

    }

    public void getEmployeeEmail(){  //method with no return type
        System.out.println("Employee email is: "+employeeEmail);
    }

    public String getEmployeeLocation(){ //method with return type
        return employeeLocation;
    }

    public int setEmployeeLevel(){  //method with  return type
        return employeeLevel;
    }

    public void findEmployeeBloodGroup(){
        System.out.println("Employee Blood Group is : "+employeeBloodGroup);
    }
    private String getEmployeePhoneNumber(){ //private access modifier
        return employeePhoneNumber;
    }
    protected void getEmployeeAge(){ //protected access modifier
        System.out.println("Employee age is: "+employeeAge);
    }
    public void setEmployeeStatus(String status){ //with param
        System.out.println("Employee Status is: "+status);
    }

}
