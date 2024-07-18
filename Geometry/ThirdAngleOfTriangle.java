import java.util.Scanner;

public class ThirdAngleOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        double angle1 = sc.nextDouble();
        System.out.print("Enter the second angle of the triangle: ");
        double angle2 = sc.nextDouble();

        double angle3 = 180.0 - (angle1 + angle2);
        System.out.println();
        System.out.println("The third angle of a triangle whose two angles are " + angle1 + " and, " + angle2
                + " is " + angle3 + ".");
        sc.close();
    }
}
