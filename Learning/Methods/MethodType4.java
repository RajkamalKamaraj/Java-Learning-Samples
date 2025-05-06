package Learning.Methods;

import java.util.Scanner;
//Method Type 4 : With Argument and With Return value
public class MethodType4 {
    public static void main(String[] args) { // This method is  "Caller"  Method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scan.nextInt();
        System.out.println("Enter second number:");
        int b = scan.nextInt();

        int c = add(a,b);

        System.out.println("Addition of two numbers is : " + c);
    }
    static int add(int x, int y){  // This Method name is "calee"
        int res = x+y;
        return res;
    }
}
