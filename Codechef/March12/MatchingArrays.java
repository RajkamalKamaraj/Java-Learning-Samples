package Codechef.March12;
import java.util.*;
public class MatchingArrays {
    public static boolean isSubsequence(int[] A, int L, int R, int[] B) {
        int i = L;
        int j = 0;

        while (i <= R && j < B.length) {
            if (A[i] == B[j]) {
                j++;
            }
            i++;
        }

        return j == B.length;  // If all elements of B were found in order
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Read the sizes of arrays A and B
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            // Read arrays A and B
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            int[] B = new int[M];
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }

            // Variable to store the count of matching subarrays
            int count = 0;

            // Iterate through all subarrays of A
            for (int L = 0; L < N; L++) {
                for (int R = L; R < N; R++) {
                    // Check if B is a subsequence of A[L, R]
                    if (isSubsequence(A, L, R, B)) {
                        count++;
                    }
                }
            }

            // Output the result for the current test case
            System.out.println(count);
        }

        scanner.close();
    }
}