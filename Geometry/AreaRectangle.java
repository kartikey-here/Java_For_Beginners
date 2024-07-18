import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = (length * breadth);

        System.out.println();
        System.out.println("The area of rectangle whose length is " + length + "cm and breadth is " + breadth
                + "cm is: " + area + "cm^2.");
        sc.close();

    }
}