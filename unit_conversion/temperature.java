import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celcius: ");
        double celcius = sc.nextDouble();

        double farheneit = celcius * 9 / 5.0 + 32;
        double kelvin = celcius + 273.0;

        System.out.println();
        System.out.println("The temperature " + celcius + "C = " + farheneit + "F.");
        System.out.println("The temperature " + celcius + "C = " + kelvin + "K.");
        System.out.println();

        System.out.print("Enter temperature in Farheneit: ");
        farheneit = sc.nextDouble();

        celcius = (farheneit - 32) * 5 / 9.0;
        kelvin = celcius + 273.0;

        System.out.println();
        System.out.println("The temperature " + farheneit + "F = " + celcius + "C.");
        System.out.println("The temperature " + farheneit + "F = " + kelvin + "K.");

        sc.close();
    }

}
