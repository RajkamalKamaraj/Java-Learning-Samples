package Codechef.March12;
import java.util.Scanner;

public class TwoBoxes {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  // Read the number of test cases
  int T = scanner.nextInt();

  // Process each test case
  for (int t = 0; t < T; t++) {
  // Read the values for X, Y, and K
     int X = scanner.nextInt();
     int Y = scanner.nextInt();
     int K = scanner.nextInt();

  // Calculate the initial difference between X and Y
     int initialDifference = Math.abs(X - Y);

  // Check if it's possible to achieve the difference K
     if (initialDifference < K || (initialDifference - K) % 2 != 0) {
        System.out.println(-1);
     } else {
  // The minimum time is (initialDifference - K) / 2
     System.out.println((initialDifference - K) / 2);
   }
  }
  // Close the scanner
  scanner.close();
  }
}
