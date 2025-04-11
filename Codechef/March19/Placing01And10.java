package Codechef.March19;
import java.util.Scanner;

public class Placing01And10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read number of test cases
        System.out.println("Enter the number of Test Cases:");
        int T = sc.nextInt();

        System.out.println("Enter X and Y values:");
        // Process each test case
        for (int t = 0; t < T; t++)
        {
            int X = sc.nextInt(); // Number of "01" strings
            int Y = sc.nextInt(); // Number of "10" strings

            // If both X and Y are greater than 0, there will be 1 transition at minimum
            if (X > 0 && Y > 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }
}
