package Codechef;

import java.util.Scanner;

public class FriendlyBinaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();

            if (canMakePalindromes(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean canMakePalindromes(String a, String b) {
        int[] aCounts = countChars(a);
        int[] bCounts = countChars(b);

        if ((aCounts[0] + bCounts[0]) % 2 != 0 || (aCounts[1] + bCounts[1]) % 2 != 0) {
            return false;
        }

        return true;
    }

    private static int[] countChars(String s) {
        int[] counts = new int[2];
        for (char c : s.toCharArray()) {
            counts[c - '0']++;
        }
        return counts;
    }
}