package javaAssignmentTask;



public class Identifiers_task1 {

    public static void employeeStatus(){
        System.out.println("Employee status is Permanent");
    }

    public static void EmployeeStatus(){
        System.out.println("Employee status is contractual");
    }
    public static void main (String args[]) {
        String employee_name1 = "Lubaba";
        int employee_id$ = 1234;

        System.out.println("Employee name is:" + employee_name1);
        System.out.println("Employee id is:" + employee_id$);
        employeeStatus();
        EmployeeStatus();
    }

    }


