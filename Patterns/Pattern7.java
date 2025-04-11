package Patterns;
/*print pattern in java:
    1
  2 1 2
1 2 3 2 1
  2 1 2
    1
 */
public class Pattern7 {
   public static void main(String[] args) {
       int n = 3;  // The height of the pattern
       // Upper part of the pattern (including the middle row)
       for (int i = 1; i <= n; i++) {
           // Print leading spaces
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }
           // Print the increasing numbers
           for (int j = 1; j <= i; j++) {
               System.out.print(j + " ");
           }

           // Print the decreasing numbers
           for (int j = i - 1; j >= 1; j--) {
               System.out.print(j + " ");
           }

           // Move to the next line
           System.out.println();
       }

       // Lower part of the pattern
       for (int i = n - 1; i >= 1; i--) {
           // Print leading spaces
           for (int j = 1; j <= n - i; j++) {
               System.out.print(" ");
           }

           // Print the increasing numbers
           for (int j = 1; j <= i; j++) {
               System.out.print(j + " ");
           }

           // Print the decreasing numbers
           for (int j = i - 1; j >= 1; j--) {
               System.out.print(j + " ");
           }

           // Move to the next line
           System.out.println();
       }
   }
}