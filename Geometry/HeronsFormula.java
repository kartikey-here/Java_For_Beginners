import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of first side of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of second side of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of third side of the triangle: ");
        double side3 = sc.nextDouble();

        double s=(side1+side2+side3)/2.0;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.println();
        System.out.println("The area of a triangle whose sides are "+side1+"cm, "+side2+"cm and, "+side3+"cm is "+area+"cm^2.");
        sc.close();
    }
}
