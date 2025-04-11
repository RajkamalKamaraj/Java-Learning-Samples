package Codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SameAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();

            List<Long> result = findBeautifulSequence(n, m);

            if (result == null) {
                System.out.println(-1);
            } else {
                System.out.println(result.size());
                for (long num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }

    private static List<Long> findBeautifulSequence(long n, long m) {
        List<Long> sequence = new ArrayList<>();
        List<Long> candidates = new ArrayList<>();

        for (long i = n; i <= m; i++) {
            if ((i & n) == n) {
                candidates.add(i);
            }
        }

        if (candidates.size() < 2) {
            return null;
        }

        for (int i = 0; i < candidates.size(); i++) {
            List<Long> currentSequence = new ArrayList<>();
            currentSequence.add(candidates.get(i));

            for (int j = i + 1; j < candidates.size(); j++) {
                if ((candidates.get(i) & candidates.get(j)) == n) {
                    currentSequence.add(candidates.get(j));
                }
            }

            if (currentSequence.size() > sequence.size()) {
                sequence = currentSequence;
            }
        }

        if (sequence.size() < 2) {
            return null;
        }

        return sequence;
    }
}