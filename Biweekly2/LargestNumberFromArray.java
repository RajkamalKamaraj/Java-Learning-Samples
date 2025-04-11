package Biweekly2;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFromArray {

    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Descending order based on combined strings
            }
        });
        if (strNums[0].equals("0")) { // Handle the case where all numbers are 0
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int[] nums1 = {10, 2};
        int[] nums2 = {3, 30, 34, 5, 9};
        int[] nums3 = {1};
        int[] nums4 = {10};
        int[] nums5 = {0,0,0,0};

        System.out.println("Largest Number: " + largestNumber(nums1)); // Output: 210
        System.out.println("Largest Number: " + largestNumber(nums2)); // Output: 9534330
        System.out.println("Largest Number: " + largestNumber(nums3)); // Output: 1
        System.out.println("Largest Number: " + largestNumber(nums4)); // Output: 10
        System.out.println("Largest Number: " + largestNumber(nums5)); // Output: 0

    }
}