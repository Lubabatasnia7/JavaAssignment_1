package javaAssignmentTask.Assignment4;

public class Task7DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        int numberOfFloor = 1;
        do {
            System.out.println("Floor : "+numberOfFloor);
            numberOfFloor +=1;
            count +=1;
        }
        while (numberOfFloor <=5);
        System.out.println("Total Floor : "+count);
    }
}
