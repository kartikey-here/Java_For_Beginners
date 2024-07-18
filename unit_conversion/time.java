//➇  Time (sec, min, hour)

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Time in seconds: ");

        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        int weeks = days / 7;
        int months = days / 30;
        int years = days / 365;

        int finalseconds = seconds % 60;
        int finalminutes = minutes % 60;
        int finalhours = hours % 24;
        int finaldays = days % 7;
        int finalweeks = weeks % 4;
        int finalmonths = months % 12;
        int finalyears = years;

        System.out.println();
        System.out.println("The Result is as follows: ");
        System.out.print(finalyears+"years ");
        System.out.print(finalmonths+"months ");
        System.out.print(finalweeks+"weeks ");
        System.out.print(finaldays+"days ");
        System.out.print(finalhours+"hours ");
        System.out.print(finalminutes+"minutes ");
        System.out.print(finalseconds+"seconds ");

        sc.close();
    }
}
