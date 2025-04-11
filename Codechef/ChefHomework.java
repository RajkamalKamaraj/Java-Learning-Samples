package Codechef;
import java.util.Scanner;

public class ChefHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int X = sc.nextInt();
          int Y = sc.nextInt();

          int totalQuestionsPossible = X + (10 * Y);

        if (totalQuestionsPossible >= 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // Close the scanner
        sc.close();
    }
}
