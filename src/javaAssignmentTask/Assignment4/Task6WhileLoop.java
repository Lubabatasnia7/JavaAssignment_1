package javaAssignmentTask.Assignment4;

public class Task6WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        int numberOfTeam = 0;
        while (numberOfTeam <=4){
            System.out.println("This is team : "+numberOfTeam);
            numberOfTeam ++;
            count +=1;
        }
        System.out.println("Total team : "+count);
    }
}
