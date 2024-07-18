// Weight (gram, kg, pound)

import java.util.Scanner;

/**
 * weight
 */
public class weight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in grams: ");
        double grams=sc.nextDouble();

        double kilograms=grams/1000.0;
        double pounds=grams/453.592;

        System.out.println();
        System.out.println("The weight "+grams+"g = "+kilograms+"kg.");
        System.out.println("The weight "+grams+"g = "+pounds+"pounds.");

        sc.close();
    }
}