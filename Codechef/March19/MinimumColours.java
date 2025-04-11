package Codechef.March19;

import java.util.*;

public class MinimumColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the size of the array N
            int N = sc.nextInt();

            // Initialize a HashSet to store distinct elements
            Set<Integer> distinctElements = new HashSet<>();

            // Read the array elements and add them to the set
            for (int i = 0; i < N; i++) {
                distinctElements.add(sc.nextInt());
            }

            // The number of distinct elements is the answer for this test case
            System.out.println(distinctElements.size());
        }

        sc.close();
    }
}
