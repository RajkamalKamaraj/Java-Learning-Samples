package Codechef.March12;
import java.util.Scanner;
public class TriangleChecking {
   public static void main(String[] args) {
    // Create a scanner object for input
    Scanner scanner = new Scanner(System.in);
    // Read the three integers A, B, and C
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    // Check the triangle inequality conditions
    if (A + B > C && B + C > A && A + C > B) {
       System.out.println("YES");
    } else {
       System.out.println("NO");
    }

    // Close the scanner
    scanner.close();
  }
 }
