
import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of square: ");
        double side = sc.nextDouble();

        double area = side * side;

        System.out.println();
        System.out.println("The area of square whose side is " + side + "cm is: " + area + "cm^2.");
        sc.close();
    }
}
