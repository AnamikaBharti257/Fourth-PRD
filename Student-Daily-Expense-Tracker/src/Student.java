
import java.util.Scanner;

class StudentExpense {

    String studentName;
    double dailyBudget;
    double foodExpense;
    double travelExpense;
    double studyExpense;
    double otherExpense;

    double calculateTotalExpense() {
        double totalExpense = foodExpense + travelExpense + studyExpense + otherExpense;
        return totalExpense;
    }

    double calculateRemainingAmount() {
        double remainingAmount = dailyBudget - calculateTotalExpense();
        return remainingAmount;
    }

    boolean isWithinBudget() {
        if (calculateTotalExpense() <= dailyBudget) {
            return true;
        } else {
            return false;
        }
    }

    double calculateExceededAmount() {
        double exceededAmount = calculateTotalExpense() - dailyBudget;

        if (exceededAmount > 0) {
            return exceededAmount;
        } else {
            return 0;
        }
    }

    String getBudgetStatus() {

        if (calculateTotalExpense() < dailyBudget) {
            return "Within Budget";
        } else if (calculateTotalExpense() == dailyBudget) {
            return "Budget Fully Used";
        } else {
            return "Budget Exceeded";
        }
    }

    void displayExpenseReport() {

        System.out.println("---------- DAILY EXPENSE REPORT ----------");
        System.out.println();
        System.out.println("Student Name      : " + studentName);
        System.out.println("Daily Budget      : " + dailyBudget);
        System.out.println("Food Expense      : " + foodExpense);
        System.out.println("Travel Expense    : " + travelExpense);
        System.out.println("Study Expense     : " + studyExpense);
        System.out.println("Other Expense     : " + otherExpense);
        System.out.println("Total Expense     : " + calculateTotalExpense());

        if (calculateTotalExpense() <= dailyBudget) {
            System.out.println("Remaining Amount  : " + calculateRemainingAmount());
        } else {
            System.out.println("Exceeded Amount   : " + calculateExceededAmount());
        }

        System.out.println("Budget Status     : " + getBudgetStatus());
        System.out.println();
        System.out.println("------------------------------------------");
    }
}

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentExpense s = new StudentExpense();

        System.out.print("Enter student name: ");
        s.studentName = sc.nextLine();

        System.out.print("Enter daily budget: ");
        s.dailyBudget = sc.nextDouble();

        System.out.print("Enter food expense: ");
        s.foodExpense = sc.nextDouble();

        System.out.print("Enter travel expense: ");
        s.travelExpense = sc.nextDouble();

        System.out.print("Enter study expense: ");
        s.studyExpense = sc.nextDouble();

        System.out.print("Enter other expense: ");
        s.otherExpense = sc.nextDouble();

        s.displayExpenseReport();

        sc.close();
    }
}
