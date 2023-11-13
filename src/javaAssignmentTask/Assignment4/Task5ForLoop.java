package javaAssignmentTask.Assignment4;

public class Task5ForLoop {
    public static void main(String[] args) {
        int count = 0; //simultaneously increment
        for (int numberOfEmployeeRegistered = 0; numberOfEmployeeRegistered <=5; numberOfEmployeeRegistered++) {
            System.out.println("Number of Employees are registered : "+numberOfEmployeeRegistered);
            count ++;
        }
        System.out.println("Total number of employee: "+count);
        System.out.println();

        int count2 =0; // increment with gap
        for (int CodenumberOfTeam =0; CodenumberOfTeam <=20; CodenumberOfTeam +=5){
            System.out.println("Code Number of Team : "+CodenumberOfTeam);
            count2 ++;
        }
        System.out.println("Total number of team : "+count2);
        System.out.println();

        int count3 = 0; //decrement
        for (int employeeRemaining = 10; employeeRemaining>=0; employeeRemaining -=1){
            System.out.println("Check remaining employee : "+employeeRemaining);
            count3 ++;
        }
        System.out.println("Employee count : "+count3);
    }
}
