package Patterns;
import java.util.Random;
import java.util.Scanner;
public class Pattern82D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the matrix (n x n)
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        // Create a 2D array of size n x n
        int[][] array = new int[n][n];

        // Initialize the Random object to generate random numbers
        Random random = new Random();

        // Generate random numbers and fill the diagonal
        for (int i = 0; i < n; i++) {
            array[i][i] = random.nextInt(100);  // Random number between 0 and 99
        }

        // Print the array in a diagonal pattern
        System.out.println("Array in Diagonal Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + "\t");  // Print diagonal elements
                } else {
                    System.out.print("\t");  // Empty spaces for non-diagonal elements
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

