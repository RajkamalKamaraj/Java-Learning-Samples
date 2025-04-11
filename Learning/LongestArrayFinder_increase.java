package Learning;

public class LongestArrayFinder_increase {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 3, 2};
        System.out.println(LongestSubarray.longestSubarray(nums));  // Output: 2
    }
    public class LongestSubarray {
        public static int longestSubarray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;  // Return 0 if the array is empty
            }

            int maxLength = 1;  // The minimum length of a subarray is 1 (itself)
            int increasingLength = 1;  // Length of the current increasing subarray
            int decreasingLength = 1;  // Length of the current decreasing subarray

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    increasingLength++;  // Extend the increasing subarray
                    decreasingLength = 1;  // Reset decreasing length
                } else if (nums[i] < nums[i - 1]) {
                    decreasingLength++;  // Extend the decreasing subarray
                    increasingLength = 1;  // Reset increasing length
                } else {
                    increasingLength = 1;  // Reset both lengths if the sequence is neither increasing nor decreasing
                    decreasingLength = 1;
                }

                // Update the maximum length found so far
                maxLength = Math.max(maxLength, Math.max(increasingLength, decreasingLength));
            }

            return maxLength;
        }


    }
}
