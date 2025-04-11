package Codechef.March19;

public class SmoothlyIncreasing {
    public static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {5, 9};
        int[] arr3 = {10, 100, 1000};
        int[] arr4 = {5, 3};
        int[] arr5 = {10, 20, 30};

        System.out.println("Is arr1 smoothly increasing? " + isSmoothlyIncreasing(arr1));  // true
        System.out.println("Is arr2 smoothly increasing? " + isSmoothlyIncreasing(arr2));  // true
        System.out.println("Is arr3 smoothly increasing? " + isSmoothlyIncreasing(arr3));  // true
        System.out.println("Is arr4 smoothly increasing? " + isSmoothlyIncreasing(arr4));  // false
        System.out.println("Is arr5 smoothly increasing? " + isSmoothlyIncreasing(arr5));  // false

        System.out.println("Is arr1 smoothly increasing? " + isStrictlyIncreasing(arr1));  // true
        System.out.println("Is arr2 smoothly increasing? " + isStrictlyIncreasing(arr2));  // true
        System.out.println("Is arr3 smoothly increasing? " + isStrictlyIncreasing(arr3));  // true
        System.out.println("Is arr4 smoothly increasing? " + isStrictlyIncreasing(arr4));  // false
        System.out.println("Is arr5 smoothly increasing? " + isStrictlyIncreasing(arr5));  // false
    }
    //Function to check if an array is strictly increasing
    public static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;  // If any pair is not strictly increasing, return false
            }
        }
        return true;
    }
    // Recursive function to check if an array is smoothly increasing
    public static boolean isSmoothlyIncreasing(int[] arr) {
        if (arr.length == 1) {
            return true;  // Base case: a single element array is trivially smoothly increasing
        }
    // Check if the array is strictly increasing
        if (!isStrictlyIncreasing(arr)) {
            return false;  // If not strictly increasing, return false
        }

    // Create the difference array
        int[] diffArray = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            diffArray[i] = arr[i + 1] - arr[i];
        }
    // Recursively check if the difference array is smoothly increasing
        return isSmoothlyIncreasing(diffArray);
    }
}
