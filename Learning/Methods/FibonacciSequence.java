package Learning.Methods;

import java.util.Scanner;

//Program to print a fibonacci sequence numbers
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a last number of fibonacci series:");
        int n = scan.nextInt();
        fib(n);
    }
    static void fib(int n){
        int a = 0, b=1,sum;
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        System.out.println(a);
        System.out.println(b);
        int count=3;
        while (count<=n){
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            count++;
        }
    }
}
