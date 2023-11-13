package javaAssignmentTask.Assignment3;

public class MainEmployeeTest2 {
    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.employeeName = "Test Employee";
        employee.employeeTeam = "QA";
        employee.employeePin = 123123123;
        System.out.println("Employee Name is : "+employee.employeeName);
        System.out.println("Employee Pin is :"+ employee.getEmployeePin());
        System.out.println("Employee Team is: "+employee.employeeTeam);

        Employee2 employee2 = new Employee2("Test Employee New ", "Dev");
        System.out.println("Employee Pin for Dev is: "+employee2.getEmployeePin());
        //as it is calling the second object hence the result is zero
        System.out.println("Employee name is: "+employee2.employeeName);
        //object is from the constructor with parameter for both case
        System.out.println("Employee Team is : "+employee2.employeeTeam);

    }
}
