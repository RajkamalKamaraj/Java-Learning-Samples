package Codechef.April2;

import java.util.Scanner;

public class CodeMat {
        public static void main(String[] args) throws java.lang.Exception {
            // your code goes here
            Scanner scan = new Scanner(System.in);
            long x = scan.nextInt();
            int y = scan.nextInt();
            if (y > x) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }