package javaAssignmentTask.Assignment2;

public class UnaryOperatorAssignment2 {
    public static void main(String[] args) {
        int employeeSalary = 120500;
        //expr++ expr-- ++expr --expr
        System.out.println(++employeeSalary); //120501
        System.out.println(employeeSalary++); //120501
        System.out.println(employeeSalary--); // 120501+1 = 120502
        System.out.println(--employeeSalary); // 120502-1 = 120501 -1 = 120500

        float employeePF = 60000.00f;
        float employeeGF = 45545.59f;
        float totalPFGF = employeePF + employeeGF;

        System.out.println(--totalPFGF); // 105,545.59 -1 = 105,544.59
        System.out.println(++totalPFGF); // 105544.59+1 = 105545.59
        System.out.println(totalPFGF--); // 105545.59
        System.out.println(totalPFGF++); // 105545.59 -1 = 105544.59
    }
}
