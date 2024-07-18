//➄  Distance (km, mile)

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers=sc.nextDouble();

        double miles=kilometers*0.62137119;

        System.out.println();
        System.out.println("The distance "+kilometers+"km = "+miles+"miles.");

        sc.close();
    }

}
