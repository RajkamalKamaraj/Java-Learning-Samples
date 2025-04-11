package Codechef.March12;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SumByOR {
    public static int computeF(int X, int Y) {
        int bitwiseOr = X | Y;
        return (X + Y + bitwiseOr - 1) / bitwiseOr;
        }
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no of values : ");
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++)
        {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
               for (int j = i + 1; j < N; j++) {
                  result += computeF(A[i], A[j]);
               }
            }
            System.out.println(result);
       }
    scanner.close();
   }
}
