package javaAssignmentTask.Assignment2;

public class LogicalOperatorAssign2 {
    public static void main(String[] args) {
        int numberOfQAMembers = 30, numberOfDevMembers = 150, numberOfProjects = 5, numberOfPMMembers = 45,
                numberOfBAMembers = 25, totalMembers;
        totalMembers = numberOfQAMembers + numberOfDevMembers + numberOfBAMembers + numberOfPMMembers;
        System.out.println((numberOfQAMembers > numberOfDevMembers) && (numberOfDevMembers > numberOfBAMembers));
        System.out.println((numberOfProjects<numberOfQAMembers) && (numberOfPMMembers > numberOfQAMembers));
        System.out.println((totalMembers > numberOfProjects) || (numberOfProjects > numberOfDevMembers));

    }
}
