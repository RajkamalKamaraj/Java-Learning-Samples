package Codechef;
import java.util.Scanner;

public class BiggerBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt();  // Length of the restaurant name
            String A = sc.next();  // Competitor's restaurant name
            // Create a mutable list of characters from string A
            char[] B = A.toCharArray();
            // Try to form a lexicographically larger string
            boolean found = false;
            for (int i = N - 1; i >= 0; i--) {
                if (B[i] != 'z') {
                    B[i] = (char) (B[i] + 1);
                    found = true;
                    break;
                } else {
                    B[i] = 'a';  // If it's 'z', roll it back to 'a'
                }
            }
            // Convert the character array back to a string
            String newName = new String(B);
            // Check if the new name and its reverse are lexicographically larger than A
            if (found && newName.compareTo(A) > 0 && new StringBuilder(newName).reverse().toString().compareTo(A) > 0) {
                System.out.println(newName);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
