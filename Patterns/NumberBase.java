package Patterns;

/*The number of rows = 5
Each row i (starting from 1) has i numbers.
The numbers in each row are increasing by 5 each time.
Pattern Analysis:
First element in each row is the row number.
Each next element is the previous one + 5.
For example:
Row 1: 1
Row 2: 2, 2+5 = 7
Row 3: 3, 3+5 = 8, 8+5 = 13
Row 4: 4, 9, 14, 19
Row 5: 5, 10, 15, 20, 25 */

import java.util.Scanner;

public class NumberBase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            int num = i;
            for(int j=1;j<=i;j++) {
                System.out.print(num+" ");
                num+=5;
            }
            System.out.println();
        }
    }
}
