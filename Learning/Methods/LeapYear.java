package Learning.Methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year :");
        long y = scan.nextLong();
        boolean res = isLeapYear(y);
        System.out.println(res);
        if(res)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
    static boolean isLeapYear(long y){
        if(y<1 || y>9999){
            return false;
        }
        else {
            if((y%4==0 && y%100 !=0) ||(y%400==0)){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
