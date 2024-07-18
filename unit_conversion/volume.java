//➆  Volume (ltr, gallon)

import java.util.Scanner;

public class volume {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume in litres: ");
        double litres=sc.nextDouble();

        double gallons=litres/3.785;

        System.out.println();
        System.out.println("The volume "+litres+"l = "+gallons+" gallons.");

        sc.close();
    }
}
