package Learning.ConditionalStatements;

import java.util.Scanner;

public class ifelseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are Elgible to vote");
        }
        else if (age>0 && age<18) {
            System.out.println("You are too young to vote");
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
