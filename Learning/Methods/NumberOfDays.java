package Learning.Methods;

import java.util.Scanner;

// Program to compute a number of days in given month and year
public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = scan.nextInt();

        System.out.println("Enter a month 1 to 12: ");
        int month = scan.nextInt();

        int days = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                 days=31;
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                days=30;
                break;

            case 2:
                if( (year%4==0 && year%100 !=0)||(year%400==0)){
                    days =29;
                }
                else
                    days=28;
                break;
            default:
                System.out.println("Invalid month");
                return;
        }
        System.out.println("Number of days: " + days);
    }
}
