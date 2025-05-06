package Learning;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : " );
        int num = scan.nextInt();
        int rev = 0, temp = num;
        while (num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
        }
    }