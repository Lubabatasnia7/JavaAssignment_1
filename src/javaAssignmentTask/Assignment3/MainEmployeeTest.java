package javaAssignmentTask.Assignment3;

public class MainEmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.employeeName = "Lubaba";
        employee.employeeID = 123412344;
        employee.employeeLevel = 2;
        employee.employeeEmail = "mail@gmail.com";
        employee.employeeBloodGroup = "B+ve";
        employee.employeeDeskNumber = 12;
        employee.employeeLocation = "Main Building";
        employee.employeePhoneNumber = "01232312343";
        employee.employeeAge = 25;

        System.out.println("Employee name is : "+employee.employeeName);
        System.out.println("Employee id is : "+employee.employeeID);
        employee.getEmployeeEmail();
        System.out.println(employee.getEmployeeLocation());
        employee.findEmployeeBloodGroup();
        System.out.println("Employee level is : "+employee.setEmployeeLevel());
        System.out.println("Employee Desk Number is : "+employee.employeeDeskNumber);
        //System.out.println("Employee Phone Number is : "+employee.getEmployeePhoneNumber());
        //unable to get output as this method has private access specifier
        employee.getEmployeeAge();
        employee.setEmployeeStatus("Permanent");
    }

}