package Learning.Iterative;
/* if we know the condition we will use for loop */

import java.util.Scanner;

public class ForloopSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n value : ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++){
            System.out.println("Print "+ i);

        }

    }
}
