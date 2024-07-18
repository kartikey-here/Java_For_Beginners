import java.util.Scanner;

/**
 * interest_calculator
 */
public class interest_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Loan Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter the Loan Interest (per month): ");
        double interest = sc.nextDouble();
        System.out.print("Enter the Time Period(in months): ");
        double time = sc.nextDouble();

        double total_interest=amount*interest*time/100.0;

        System.out.println("The Interest on amount "+amount+" at interest "+ interest+ "% per month for the time period of "+time+" months is "+total_interest);
sc.close();
    }
}