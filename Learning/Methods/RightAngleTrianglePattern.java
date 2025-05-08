package Learning.Methods;

import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n value:");
        int n = scan.nextInt();

        generatepattern(n);
    }
    static void generatepattern(int n){
        for(int i=1;i<=n;i++){            //Loop for generating spaces
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
