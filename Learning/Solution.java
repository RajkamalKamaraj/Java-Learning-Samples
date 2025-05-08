package Learning;

import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a number of Pizza Piece");
       int N = scan.nextInt();
       int pizza = 1;
       while ((pizza * N) % 2 != 0) {
           pizza++;
       }
       System.out.println(pizza);
   }
   }

