package javaAssignmentTask.Assignment2;

public class ArithmeticOperatorAssign2 {
    public static void main(String[] args) {
        int employeeBasicSalary = 85000, employeeOtherAllowance = 15000, employeePFDeduction = 11500,
                employeeNumber = 540, employeeIndividualAsset = 3, numberOfChair = 1080, employeeTotal, employeeTotalAfterDeduction,
                totalAssets, numberOfChairPerEmployee, remainingChair;

        employeeTotal = employeeBasicSalary + employeeOtherAllowance;
        System.out.println(employeeTotal); //100000

        employeeTotalAfterDeduction = employeeTotal - employeePFDeduction;
        System.out.println(employeeTotalAfterDeduction); //88500

        totalAssets = employeeNumber * employeeIndividualAsset;
        System.out.println(totalAssets); // 1620

        numberOfChairPerEmployee = numberOfChair / employeeNumber;
        System.out.println(numberOfChairPerEmployee); //2

        remainingChair = numberOfChair % employeeNumber;
        System.out.println(remainingChair); //0

    }
}
