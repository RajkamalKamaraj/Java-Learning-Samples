package Patterns;

import java.util.*;

public class OddandEvenPosition {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }

        Collections.sort(odd);
        odd.sort(Collections.reverseOrder());

        // Merge back into array
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = even.get(evenIndex++);
            } else {
                arr[i] = odd.get(oddIndex++);
            }
        }

        // Print result
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
