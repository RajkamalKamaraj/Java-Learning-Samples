package Learning.Iterative;
/* program for find Greatest Common Divisor (GCD) or Highest Common Divisor(HCF) */

import java.lang.reflect.Method;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number 1");
        int num1 = scan.nextInt();
        System.out.println("Enter a Number 2");
        int num2 = scan.nextInt();

//        Method 1
//        int gcd =1;
//        for(int i=1;i<num1 && i<num2;i++){
//            if(num1 % i == 0 && num2 % i ==0 )
//                gcd = i;
//        }
//System.out.println("GCD of " + num1 + "and "  + num2 + " " +  "="+ gcd);
//        Eculids methods
        int min = Math.min(num1,num2);
        int max = Math.max(num1, num2);
        int temp;
        while (max !=0){
            temp = max % min;
            max = min;
            min = temp;
        }
        System.out.println("GCD of " + num1 + "and "  + num2 + " " +  "="+ min);

    }
}
