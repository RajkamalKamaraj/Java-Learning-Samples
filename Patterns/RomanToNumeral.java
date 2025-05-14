package Patterns;

import com.sun.jdi.Value;

import java.util.HashMap;

public class RomanToNumeral {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < prevValue) {
                total -= current;
            } else {
                total += current;
            }
            prevValue = current;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));    // 14
        System.out.println(romanToInt("MCMXCIV"));
    }
}
