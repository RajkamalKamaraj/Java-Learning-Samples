package Learning;

import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String A=sc.next();
       String B=sc.next();
       /* Enter your code here. Print output to STDOUT. */
       String C = A+B;
       System.out.println(C.length());
       if(A.length()>B.length()){
          System.err.println("No");
       }
       else{
         System.err.println("Yes");
       }

       System.out.println(A.substring(0,1).toUpperCase() + B.substring(0,1).toUpperCase());
    }
    }
