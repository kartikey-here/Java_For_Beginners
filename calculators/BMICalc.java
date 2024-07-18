import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight(in kilograms): ");
        double weight=sc.nextDouble();
        System.out.print("Enter the height(in meters): ");
        double height=sc.nextDouble();

        double bmi=weight/(height*height);

        System.out.println("The BMI of a person whose height is "+height+"m and weight is "+weight+"kg is "+bmi);
        sc.close();
    }
}
