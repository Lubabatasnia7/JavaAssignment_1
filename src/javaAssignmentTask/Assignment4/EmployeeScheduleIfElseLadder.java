package javaAssignmentTask.Assignment4;

import java.util.Scanner;

public class EmployeeScheduleIfElseLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current time : ");
        double time = sc.nextDouble();
        System.out.println("Time is : "+time);
        if (time == 9.30 && time<=11.00){
            System.out.println("Breakfast time!!!");
        } else if (time > 11.00 && time<13.00) { //calculating time zone to 24 hour hence 1pm= 13pm
            System.out.println("Work Hour...");
        }
        else if(time>=14.00 && time<=15.30){
            System.out.println("Lunch time.");
        } else if (time >15.30 && time<=17.30) {
            System.out.println("Work Hour second half.");
        } else if (time >17.30 && time <=18.00) {
            System.out.println("Snacks Time!!!");
        }
        else {
            System.out.println("Office is over!!!");
        }
    }
}
