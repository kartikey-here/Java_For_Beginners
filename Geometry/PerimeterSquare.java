
import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square: ");
        double side = sc.nextDouble();

        double perimeter = side * 4.0;

        System.out.println();
        System.out.println("The perimeter of square whose side is " + side + "cm is: " + perimeter + "cm.");
        sc.close();
    }
}
