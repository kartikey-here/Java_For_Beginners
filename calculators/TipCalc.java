import java.util.Scanner;

public class TipCalc {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the total price: ");
        double price=sc.nextDouble();
        System.out.print("Enter the tip percent: ");
        double tip_percent=sc.nextDouble();

        double tip=tip_percent*price/100.0;
        double final_price=price+tip;

        System.out.println("The tip of "+tip_percent+"% on the price "+price+ " is: "+tip);
        System.out.println("The final amount to be paid after adding tip is: "+final_price);
        
        
        
        
        
        
        sc.close();
    }
}