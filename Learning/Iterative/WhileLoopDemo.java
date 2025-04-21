package Learning.Iterative;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum=0,r;

        while (n>0){
            r = n%10;
            sum = sum + r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
