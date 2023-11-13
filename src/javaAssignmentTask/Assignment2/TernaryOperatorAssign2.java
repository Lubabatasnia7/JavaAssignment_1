package javaAssignmentTask.Assignment2;

public class TernaryOperatorAssign2 {
    public static void main(String[] args) {
        int numberOfCurrentProject = 5, numberOfOngoingProject = 3, numberOfEmployee = 125, remainingProject = 2, project;

        project = (numberOfCurrentProject > numberOfOngoingProject) ? numberOfCurrentProject : numberOfOngoingProject;
        System.out.println(project); //5

        numberOfEmployee = (project < numberOfOngoingProject) ? numberOfEmployee : remainingProject;
        System.out.println(numberOfEmployee); //2
    }


}
