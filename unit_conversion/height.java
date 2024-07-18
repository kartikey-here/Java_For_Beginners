//➂  Height (cm, m, inch, feet)

import java.util.Scanner;

public class height {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in centimeters: ");
        double centimeters=sc.nextDouble();

        double meters=centimeters/100.0;
        double kilometers=meters/1000.0;
        double inch=centimeters/2.52;
        double feet=inch/12;

        System.out.println();
        System.out.println("The height "+centimeters+"cm = "+meters+"m.");
        System.out.println("The height "+centimeters+"cm = "+kilometers+"km.");
        System.out.println("The height "+centimeters+"cm = "+inch+"in.");
        System.out.println("The height "+centimeters+"cm = "+feet+"ft.");

        sc.close();
    }
}
