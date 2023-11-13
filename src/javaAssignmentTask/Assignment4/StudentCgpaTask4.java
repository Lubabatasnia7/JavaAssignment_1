package javaAssignmentTask.Assignment4;

import java.util.Scanner;

public class StudentCgpaTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = sc.nextInt();
        System.out.println("Mark is : "+mark);
        if (mark>=80){
            if(mark>=80 && mark<86){
                System.out.println("Mark is : "+mark+ " Grade is B");
            } else if (mark >=86 && mark<90) {
                System.out.println("Mark is : "+mark+ " Grade is B+");
            } else if (mark >=90 && mark<96) {
                System.out.println("Mark is : "+mark+ " Grade is A");
            } else {
                System.out.println("Mark is : "+mark+ " Grade is A+");
            }
        }
        else {
            System.out.println("Marks is : "+mark+ " Grade is below B+");
        }
    }
}
