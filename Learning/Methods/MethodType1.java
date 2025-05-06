package Learning.Methods;

import java.util.Scanner;
//Method type 1 - Without Argument and Without return type
public class MethodType1 {
    public static void main(String[] args) {
        add();
    }
    static void add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = a + b;
        System.out.println("Addition of two numbers are: "+ c);
    }
}
