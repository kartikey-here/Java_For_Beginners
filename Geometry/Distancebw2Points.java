import java.util.Scanner;

public class Distancebw2Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point: ");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the coordinates of the second point: ");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between points ("+x1+","+y1+") and ("+x2+","+y2+") is "+distance);

        sc.close();
    }
}
