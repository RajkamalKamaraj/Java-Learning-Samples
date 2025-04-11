package Patterns;
/* print pattern in java:
    1
  2 1 2
1 2 3 2 1
  2 1 2
    1
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5; // Number of rows (adjust as needed)
        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}