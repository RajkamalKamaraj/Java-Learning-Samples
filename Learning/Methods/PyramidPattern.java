package Learning.Methods;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n value:");
        int n = scan.nextInt();

        generatepattern(n);
    }
    static void generatepattern(int n){
        int i=1;
        while (i<=n){
            //Loop for generating spaces
            for(int space=n-i;space>=0;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}
