package Biweekly2;
import java.util.Stack;

public class getNumberSequence {
    public static String smallestNumber(String pattern) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 1;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            stack.push(num++);

            if (ch == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        stack.push(num++); // Push the last number

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String pattern1 = "IDID";
        String pattern2 = "IIDDD";
        String pattern3 = "D";
        String pattern4 = "II";


        System.out.println("Pattern: " + pattern1 + ", Smallest Number: " + smallestNumber(pattern1));
        System.out.println("Pattern: " + pattern2 + ", Smallest Number: " + smallestNumber(pattern2));
        System.out.println("Pattern: " + pattern3 + ", Smallest Number: " + smallestNumber(pattern3));
        System.out.println("Pattern: " + pattern4 + ", Smallest Number: " + smallestNumber(pattern4));
    }
}