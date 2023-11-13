package javaAssignmentTask.Assignment4;

public class Task8BreakStatement {
    public static void main(String[] args) {
        int totalCount = 0;
        for (int numberOfChair =0; numberOfChair<=100; numberOfChair +=5){
            if (numberOfChair >=25) break;
            System.out.println("Chair number "+numberOfChair);
            totalCount +=1;
        }
        System.out.println("Total Count is : "+totalCount);
    }
}
