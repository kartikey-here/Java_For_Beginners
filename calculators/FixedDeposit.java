import java.util.Scanner;

public class FixedDeposit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter FD Amount: ");
        double amount=sc.nextDouble();
        System.out.print("Enter FD Interest: ");
        double interest=sc.nextDouble();
        System.out.print("Enter FD Time in months: ");
        double time=sc.nextDouble();

        double total_amount=amount*interest*time/100.0+ amount;

        System.out.println();
        System.out.println("The total Amount after "+time+"months is "+total_amount+" Rupees");
sc.close();
    }
}
