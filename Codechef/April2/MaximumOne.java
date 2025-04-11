package Codechef.April2;
import java.util.Scanner;

public class MaximumOne {
    public static int maxOne(String S, int K){
        char[] arr = S.toCharArray();
        int n = arr.length;
        int maxOnes = countOnes(arr);
        if(K==0)
            return maxOnes;
        for(int i=0;i<n-1;n++){
            if(arr[i]=='0'&& arr[i+1]=='1'){
                int operationsUsed = 0;
                int j = i;
                while (j >= 0 && operationsUsed < K && arr[j] == '0') {
                    arr[j] = '1';
                    operationsUsed++;
                    j--;
                }
               maxOnes = Math.max(maxOnes, countOnes(arr));
               if (operationsUsed >= K) {
                    break;
                }
            }
        }
        return maxOnes;
    }
    private static int countOnes(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = "10101010";
        int K = scan.nextInt();
        System.out.println(maxOne(S,K));
    }
}
