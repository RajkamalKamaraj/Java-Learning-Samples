package Codechef;

import java.util.Scanner;

public class ClothingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int happyPeople = 0;

            // First, satisfy as many direct matches as possible
            int smallMatches = Math.min(x, a);
            happyPeople += smallMatches;
            x -= smallMatches;
            a -= smallMatches;

            int largeMatches = Math.min(y, b);
            happyPeople += largeMatches;
            y -= largeMatches;
            b -= largeMatches;

            int extraLargeMatches = Math.min(z, c);
            happyPeople += extraLargeMatches;
            z -= extraLargeMatches;
            c -= extraLargeMatches;

            // Now, use XL to satisfy L and S
            int largeFromXL = Math.min(z, b);
            happyPeople += largeFromXL;
            z -= largeFromXL;
            b -= largeFromXL;

            int smallFromXL = Math.min(z, a);
            happyPeople += smallFromXL;
            z -= smallFromXL;
            a -= smallFromXL;

            // Finally, use L to satisfy S
            int smallFromL = Math.min(y, a);
            happyPeople += smallFromL;
            y -= smallFromL;
            a -= smallFromL;

            System.out.println(happyPeople);
        }
        scanner.close();
    }
    }
