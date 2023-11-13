package javaAssignmentTask.Assignment3;

public class Employee2 {
    String employeeName;
    long employeePin;
    String employeeTeam;

    public Employee2(){ //no param

    }
    public Employee2(String name, String team){ //two param
        this.employeeName = name;
        this.employeeTeam = team;
    }
    public long getEmployeePin(){
        return employeePin;
    }

}
