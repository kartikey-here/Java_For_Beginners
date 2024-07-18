import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the Item: ");
        double price = sc.nextDouble();
        System.out.print("Enter the tax percent on the Item: ");
        double tax_percent = sc.nextDouble();
        System.out.print("Enter the discount percent of the Item: ");
        double discount_percent = sc.nextDouble();
        System.out.print("Enter the shipping charges on the Item: ");
        double shipping_charges = sc.nextDouble();

        double tax = tax_percent * price / 100.0;
        double discount = discount_percent * price / 100.0;
        double final_price = price + tax - discount + shipping_charges;

        System.out.println();
        System.out.println("The Final Price of an item whose original price was " + price + "Rs after applying tax "
                + tax_percent + "% ,discount "+discount_percent+"% ,and shipping charges "+shipping_charges+" is :"+final_price);

        sc.close();
    }
}
