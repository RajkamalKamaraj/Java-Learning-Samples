package Learning.Methods;

import java.util.Scanner;

public class TriangleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Triangle Number value :");
        int n = scan.nextInt();
        int res = computeTriangleNumber(n);
        System.out.println("Triangle Number = " + res);
    }
    static int computeTriangleNumber(int n){
        return (n*(n+1)/2);
    }
}
