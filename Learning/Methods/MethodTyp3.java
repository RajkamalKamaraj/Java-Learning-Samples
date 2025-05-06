package Learning.Methods;

import java.util.Scanner;
//Method Type 3 : With Argument and Without Return value
public class MethodTyp3 {
    public static void main(String[] args) { // This method is  "Caller"  Method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();

        add(a,b);

        //System.out.println("Addition of two numbers is : " + c);
    }
    static void add(int x, int y){  // This Method name is "calee"
        int res = x+y;
        System.out.println("Addition of two numbers is : " + res);
    }
}

