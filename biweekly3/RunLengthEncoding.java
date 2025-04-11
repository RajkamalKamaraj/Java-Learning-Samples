package biweekly3;

public class RunLengthEncoding {
    // Method to perform Run-Length Encoding without StringBuilder
    public static String encode(String input) {
        // Edge case: if input is empty, return an empty string
        if (input == null || input.length() == 0) {
            return "";
        }

        // Initialize the result as an empty string
        String result = "";

        int count = 1;

        // Traverse the input string
        for (int i = 1; i < input.length(); i++) {
            // If current character matches the previous one, increment the count
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Otherwise, append the previous character and its count to the result
                result += input.charAt(i - 1) + Integer.toString(count);
                count = 1;  // Reset count for the new character
            }
        }

        // Append the last character and its count
        result += input.charAt(input.length() - 1) + Integer.toString(count);

        return result;
    }

    public static void main(String[] args) {
        String input = "aaabbbccc";
        String encodedString = encode(input);
        System.out.println("Encoded string: " + encodedString); // Output: a3b3c3
    }
}
