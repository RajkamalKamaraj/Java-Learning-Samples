package biweekly3;

import java.util.Scanner;

public class NeedleInHaystack {
    // Method to find the first occurrence of 'needle' in 'haystack'
    public static int strStr(String haystack, String needle) {
        // Use the built-in indexOf() method to find the first occurrence
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        //String haystack = "hello";
        //String needle = "ll";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Haystack");
        String haystack = scan.next();

        System.out.println("Enter a Needle");
        String needle = scan.next();

        // Find the index of the first occurrence of needle in haystack
        int result = strStr(haystack, needle);

        System.out.println("The first occurrence of the needle is at index: " + result);
        // Output: The first occurrence of the needle is at index: 2
    }
}
