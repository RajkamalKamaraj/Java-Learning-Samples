package Learning.Methods;

import java.util.Scanner;
//Method Type 2 - Without Argument and with return type
public class MethodType2 {
    public static void main(String[] args) {

        int res = add();
            System.out.println("Addition of two numbers are: "+ res);
    }
    static int add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = a + b;

        return (c);
    }
}
