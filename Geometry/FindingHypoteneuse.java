import java.util.Scanner;

public class FindingHypoteneuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the altitude of the right angled triangle: ");
        double altitude = sc.nextDouble();
        System.out.print("Enter the base of the right angled triangle: ");
        double base = sc.nextDouble();

        double hypoteneuese = Math.sqrt(altitude * altitude + base * base);

        System.out.println();
        System.out.println("The hypoteneuese of a right angled triangle whose altitude is " + altitude
                + "cm and base is " + base + "cm is " + hypoteneuese + "cm.");
        sc.close();
    }
}
