package javaAssignmentTask.Assignment2;

public class AssignmentOperatorAssign2 {
    public static void main(String[] args) {
        int numberOfCurrentProject = 5, numberOfOngoingProject = 3, numberOfEmployee = 125, remainingProject = 2;

        numberOfEmployee += numberOfCurrentProject; //125+5 = 130
        System.out.println(numberOfEmployee);

        numberOfEmployee -= numberOfOngoingProject; // 130-3 = 127
        System.out.println(numberOfEmployee);

        numberOfCurrentProject *= remainingProject; //5*2 =10
        System.out.println(numberOfCurrentProject);

        numberOfEmployee %= remainingProject; //127%2=1
        System.out.println(numberOfEmployee);

        numberOfCurrentProject /= remainingProject; //10/2 =5
        System.out.println(numberOfCurrentProject);

    }
}
