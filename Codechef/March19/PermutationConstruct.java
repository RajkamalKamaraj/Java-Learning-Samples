package Codechef.March19;

import java.util.*;

public class PermutationConstruct {

    // Function to find a derangement for a group of numbers
    public static List<Integer> generateDerangement(List<Integer> group) {
        int size = group.size();
        List<Integer> derangement = new ArrayList<>(group);

        // If group size is 1, it's impossible to derange it
        if (size == 1) return null;

        // Derange by rotating the elements
        Collections.rotate(derangement, 1);

        return derangement;
    }

    // Function to solve for one test case
    public static String solve(int N, int K) {
        // Group the indices by their remainder when divided by K
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int modClass = i % K;
            groups.computeIfAbsent(modClass, key -> new ArrayList<>()).add(i);
        }

        // Prepare the result permutation array
        int[] result = new int[N];

        // For each group, generate a deranged permutation
        for (Map.Entry<Integer, List<Integer>> entry : groups.entrySet()) {
            List<Integer> group = entry.getValue();
            List<Integer> derangedGroup = generateDerangement(group);

            if (derangedGroup == null) {
                return "-1";  // If any group can't be deranged, return -1
            }

            // Place the deranged group back into the result array
            for (int i = 0; i < group.size(); i++) {
                result[group.get(i) - 1] = derangedGroup.get(i);
            }
        }

        // Convert result array to space-separated string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            // Solve the current test case and output the result
            System.out.println(solve(N, K));
        }

        sc.close();
    }
}
