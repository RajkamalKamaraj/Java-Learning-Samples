//package Codechef.March19;
//
//public class SmoothlyIncrasing {
//        // Function to check if an array is strictly increasing
//        public static boolean isStrictlyIncreasing(int[] arr) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] >= arr[i + 1]) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        // Recursive function to check if an array is smoothly increasing
//        public static boolean isSmoothlyIncreasing(int[] arr) {
//            if (arr.length == 1) {
//                return true; // Base case: a single element array is trivially smoothly increasing
//            }
//
//            // Check if the array is strictly increasing
//            if (!isStrictlyIncreasing(arr)) {
//                return false; // If not strictly increasing, return false
//            }
//
//            // Create the difference array
//            int[] diffArray = new int[arr.length - 1];
//            for (int i = 0; i < arr.length - 1; i++) {
//                diffArray[i] = arr[i + 1] - arr[i];
//            }
//
//            // Recursively check if the difference array is smoothly increasing
//            return isSmoothlyIncreasing(diffArray);
//        }
//
//        // Function to solve the problem for each test case
//        public static void processTestCase(int[] arr) {
//            for (int i = 0; i < arr.length; i++) {
//                // Remove the element at index i
//                List<Integer> newArrList = new ArrayList<>();
//                for (int j = 0; j < arr.length; j++) {
//                    if (j != i) {
//                        newArrList.add(arr[j]);
//                    }
//                }
//                // Convert the list back to array
//                int[] newArr = newArrList.stream().mapToInt(Integer::intValue).toArray();
//
//                // Check if the new array is smoothly increasing
//                if (isSmoothlyIncreasing(newArr)) {
//                    System.out.print("YES ");
//                } else {
//                    System.out.print("NO ");
//                }
//            }
//            System.out.println();
//        }
//
//        // Main function to read input and solve the problem
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//
//            // Read number of test cases
//            int T = sc.nextInt();
//
//            // Process each test case
//            for (int t = 0; t < T; t++) {
//                int N = sc.nextInt(); // Length of the array
//                int[] arr = new int[N];
//                for (int i = 0; i < N; i++) {
//                    arr[i] = sc.nextInt(); // Input array
//                }
//
//                // Process the test case
//                processTestCase(arr);
//            }
//
//            sc.close();
//        }
//    }
//
