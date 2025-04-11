package Codechef;
import java.util.*;

public class MeximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int T = scanner.nextInt();

        while (T-- > 0) {
            // Read the size of the array
            int N = scanner.nextInt();
            int[] A = new int[N];

            // Read the array elements
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Calculate prefix sums
            long[] prefixSum = new long[N + 1];
            for (int i = 0; i < N; i++) {
                prefixSum[i + 1] = prefixSum[i] + A[i];
            }

            // Calculate suffix sums
            long[] suffixSum = new long[N + 1];
            for (int i = N - 1; i >= 0; i--) {
                suffixSum[i] = suffixSum[i + 1] + A[i];
            }

            // To track the result for the current test case
            long minResult = Long.MAX_VALUE;
            long maxResult = Long.MIN_VALUE;
            boolean foundGoodPair = false;

            // Try all possible good pairs (L, R)
            for (int L = 1; L < N - 1; L++) {
                for (int R = L + 1; R < N; R++) {
                    // Calculate MEX for the three segments: [1..L], [L+1..R], [R+1..N]
                    Set<Integer> leftSet = new HashSet<>();
                    Set<Integer> midSet = new HashSet<>();
                    Set<Integer> rightSet = new HashSet<>();

                    for (int i = 0; i < L; i++) leftSet.add(A[i]);
                    for (int i = L; i < R; i++) midSet.add(A[i]);
                    for (int i = R; i < N; i++) rightSet.add(A[i]);

                    int mexLeft = findMex(leftSet);
                    int mexMid = findMex(midSet);
                    int mexRight = findMex(rightSet);

                    if (mexLeft == mexMid && mexMid == mexRight) {
                        // This is a good pair, compute the result
                        long result = prefixSum[L] - prefixSum[R] + suffixSum[R];
                        minResult = Math.min(minResult, result);
                        maxResult = Math.max(maxResult, result);
                        foundGoodPair = true;
                    }
                }
            }

            // Output the result for the current test case
            if (foundGoodPair) {
                System.out.println(minResult + " " + maxResult);
            } else {
                System.out.println("-1");
            }
        }

        scanner.close();
    }

    // Helper function to find MEX of a set
    private static int findMex(Set<Integer> set) {
        int mex = 0;
        while (set.contains(mex)) {
            mex++;
        }
        return mex;
    }
}
