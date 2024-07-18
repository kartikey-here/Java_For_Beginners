import java.util.Scanner;

public class PerimeterRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double perimeter = 2.0 * (length + breadth);

        System.out.println();
        System.out.println("The perimeter of rectangle whose length is " + length + "cm and breadth is " + breadth
                + "cm is: " + perimeter + "cm.");
        sc.close();

    }
}