package Learning.Iterative;

import java.util.Scanner;

//Write a program to find a prime number
public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Whole number to check:");
        int number = scan.nextInt();
        int factor = 0;
        for(int i=2;i<number;i++){
            if(number%i==0)
                factor++;
        }
        if(factor==0){
            System.out.println("prime");
        }
        else
            System.out.println("Not Prime");
    }
}
