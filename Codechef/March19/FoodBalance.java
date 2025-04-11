package Codechef.March19;

import java.util.Scanner;

public class FoodBalance {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read the four integers F1, P1, F2, P2
            int F1 = sc.nextInt();
            int P1 = sc.nextInt();
            int F2 = sc.nextInt();
            int P2 = sc.nextInt();

            // Calculate the absolute differences
            int diff1 = Math.abs(F1 - P1);
            int diff2 = Math.abs(F2 - P2);

            // Determine which dish Chef will choose
            if (diff1 < diff2) {
                System.out.println("First");
            } else if (diff1 > diff2) {
                System.out.println("Second");
            } else {
                System.out.println("Both");
            }

            sc.close();
        }
    }