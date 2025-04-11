package biweekly3;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        // Get the Zigzag converted string
        String zigzag = convert(s, numRows);

        // Output the result
        System.out.println("Zigzag Conversion: " + zigzag);  // Output: PAHNAPLSIIGYIR
    }
    public static String convert(String s, int numRows) {
        // If numRows is 1, return the string as is (no zigzag needed)
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Array to store each row of the zigzag pattern
        String[] rows = new String[numRows];

        // Initialize all rows to empty strings
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;  // To track the current row
        boolean goingDown = false;  // Flag to track if we are going down or up

        // Traverse the string and place each character in the correct row
        for (char c : s.toCharArray()) {
            // Add the character to the appropriate row
            rows[currentRow] += c;

            // Change direction if we reach the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down depending on the direction
            currentRow += goingDown ? 1 : -1;
        }

        // Concatenate all rows to form the final zigzag string
        String result = "";
        for (String row : rows) {
            result += row;  // Concatenate each row's string
        }

        return result;
    }

}
