package Learning.Methods;

import java.util.Scanner;

public class FloydTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n value :");
        int n = scan.nextInt();

        generatepattern(n);
    }

    static void generatepattern(int n) {
        int floyd = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(floyd++ + " ");
            }
            System.out.println();
        }
    }
}