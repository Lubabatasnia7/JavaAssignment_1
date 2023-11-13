package javaAssignmentTask.Assignment5;

public class VariableMainTest {
    public static void main(String[] args) {
        //VariableTask1.studentName; // as it's not an static variable need to create object first
        System.out.println(VariableTask1.studentScholarship);

        VariableTask1 task1 = new VariableTask1();
        System.out.println(task1.studentName);
        System.out.println(task1.studentID);
        System.out.println(task1.studentScholarship);
        task1.studentCGPA();

    }
}
