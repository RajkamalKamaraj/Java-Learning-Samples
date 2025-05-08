package Learning.Methods;

import java.util.Scanner;

public class PatternInvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n value :");
        int n = scan.nextInt();

        generatepattern(n);
    }
    static void generatepattern(int n){
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
