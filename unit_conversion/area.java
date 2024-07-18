//➅  Area (m², km², acre)

import java.util.Scanner;

public class area {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area in metersquares (m^2): ");
        double metersquare=sc.nextDouble();

        double kilometersquare=metersquare/1000000.0;
        double acre=metersquare/4047;

        System.out.println();
        System.out.println("The area "+metersquare+" m^2 = "+kilometersquare+" km^2.");
        System.out.println("The area "+metersquare+" m^2 = "+acre+" acre.");

        sc.close();
    }
}
