package Learning.Iterative;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int duplicate = number;
        int reverse = 0, r;

        //Applying loop login, We don't know the condition so we apply while loop
        while (number>0) {
            r = number % 10;
            reverse = reverse * 10 + r;
            number = number / 10;
        }
        //check the original and changed value
        if(duplicate == reverse){
            System.out.println("palindrome");
        }
        else
            System.out.println("Not a Palindrome");
    }
}
