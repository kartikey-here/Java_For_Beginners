
import java.util.Scanner;

public class LoanEMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loan=sc.nextDouble();
        System.out.print("Enter Time Period in months: ");
        double months=sc.nextDouble();

        double EMI=loan*1.0/months;

        System.out.println();
        System.out.println("The No Cost EMI for the loan of "+loan+" Rupees is "+EMI+" Rupees per month for "+months+" months.");

        sc.close();

    }
}