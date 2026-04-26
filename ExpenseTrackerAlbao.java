package bsit2_2n;
import java.util.Scanner;

public class ExpenseTrackerAlbao {
    public static void programName() {
        System.out.println("============ EXPENSE TRACKER =============");
    }

    public static float expenseCalculation() {
        Scanner input = new Scanner(System.in);
        System.out.println("============ YOUR EXPENSES =============");
        System.out.print("Food: ");
        float efood = input.nextFloat();

        System.out.print("Transportation: ");
        float etrans = input.nextFloat();

        System.out.print("Other Expenses: ");
        float eothex = input.nextFloat();

        float totalEx = (efood + etrans + eothex);
        return totalEx;
    }

    public static String warningMessage(float tbudget, float totalEx) {	
    	if (totalEx > tbudget) {
            return "[Warning !!!] Unfortunately, your total expense exceeds your budget."
            + "\nPlease start saving...";
        } else {
            return "";
        }
    }

    public static void totalExpnbudgetStat(float tbudget, float totalEx) {
        System.out.println("============ TOTAL & BUDGET STATUS =============");
        System.out.println("Total Expenses: " + totalEx);
        if (totalEx < tbudget) {
            System.out.println("Budget Status: Your Expenses is within the budget.");
        } else if (totalEx == tbudget) {
            System.out.println("Budget Status: Your Expenses reached the budget limit.");
        } else {
            System.out.println("Budget Status: Your Expenses exceeded the budget.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        programName();

        System.out.print("Input your total budget: ");
        float tbudget = input.nextFloat();

        float totalEx = expenseCalculation();
          
        System.out.println(warningMessage(tbudget, totalEx));
        totalExpnbudgetStat(tbudget, totalEx);
        
        float remBal = (tbudget - totalEx);
        System.out.println("Remaining Balance: " +remBal);
        
        input.close();
	}

}
