//➈  Currency

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency in Rupees: ");
        double rupees = sc.nextDouble();

        double dollar = rupees *0.012;
        double euro = rupees *0.011;
        double yen = rupees *1.9;
        double ruby = rupees *1.05;
        double rial = rupees *0.045;
        double dinar = rupees *0.0037;
        double won = rupees *16.57;

        System.out.println();
        System.out.println("The currency " + rupees + " Rupees = " + dollar + " USD.");
        System.out.println("The currency " + rupees + " Rupees = " + euro + " Euro.");
        System.out.println("The currency " + rupees + " Rupees = " + yen + " Yen.");
        System.out.println("The currency " + rupees + " Rupees = " + ruby + " Ruby.");
        System.out.println("The currency " + rupees + " Rupees = " + rial + " Rial.");
        System.out.println("The currency " + rupees + " Rupees = " + dinar + " Dinar.");
        System.out.println("The currency " + rupees + " Rupees = " + won + " Won.");

        sc.close();
    }
}
