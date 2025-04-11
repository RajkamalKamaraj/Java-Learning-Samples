package LeetCode;

public class CountPrefixSufix {
    public static boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
    // Function to count the number of index pairs (i, j) where i < j
    public static int countPairs(String[] words) {
        int count = 0;
        int n = words.length;

        // Iterate over all pairs (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        // Test the function with an example input
        String[] words = {"ab", "abab", "ba", "ababa"};
        int result = countPairs(words);
        System.out.println(result);  // Expected output: 2 (Pairs are (0, 1) and (2, 3))
    }
}