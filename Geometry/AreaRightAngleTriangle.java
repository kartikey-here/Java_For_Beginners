import java.util.Scanner;

public class AreaRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of altitude of the triangle: ");
        double altitude = sc.nextDouble();
        System.out.print("Enter the length of base of the triangle: ");
        double base = sc.nextDouble();

        double area=altitude*base/2.0;

        System.out.println();
        System.out.println("The area of a triangle whose sides are "+altitude+"cm, "+base+"cm is "+area+"cm^2.");
        sc.close();
    }
}
