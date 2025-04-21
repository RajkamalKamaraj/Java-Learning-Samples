package Learning.ConditionalStatements;

import java.util.Scanner;

/*
  write a program that prints an entered number.But for multiplies of three print "Fizz" instead of a number
  and for multiples of five print "Buzz". For number which multiples of both three and five print "FizzBuzz".
 */
public class NestedifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if(number % 3==0){
            if(number % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        }
        else if (number % 5 ==0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("Entered number " + number);
        }
    }
}
