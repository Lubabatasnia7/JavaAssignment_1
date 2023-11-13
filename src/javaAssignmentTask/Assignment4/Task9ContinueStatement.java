package javaAssignmentTask.Assignment4;

public class Task9ContinueStatement {
    public static void main(String[] args) {
        int totalCount =0;
        for (int numberOfRoom = 0; numberOfRoom <15; numberOfRoom +=1){
            if (numberOfRoom >=10) continue;
            System.out.println("Number of Room : "+numberOfRoom);
            totalCount +=1;
        }
        System.out.println("Total Count : "+totalCount);
    }
}
