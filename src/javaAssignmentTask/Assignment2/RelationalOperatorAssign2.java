package javaAssignmentTask.Assignment2;

public class RelationalOperatorAssign2 {
    public static void main(String[] args) {
        int numberOfQAMembers = 30, numberOfDevMembers = 150, numberOfProjects = 5, numberOfPMMembers = 45,
                numberOfBAMembers = 25, totalMembers;
        System.out.println(numberOfQAMembers > numberOfDevMembers);
        System.out.println(numberOfPMMembers < numberOfDevMembers);
        System.out.println(numberOfProjects >=5);
        System.out.println(numberOfBAMembers <=25);
        totalMembers = numberOfQAMembers + numberOfDevMembers + numberOfBAMembers + numberOfPMMembers;
        System.out.println(totalMembers == 300);
        System.out.println(totalMembers !=500);
    }
}
