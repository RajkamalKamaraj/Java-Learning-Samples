package Learning.Methods;

import java.util.Scanner;

public class DymondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a n value:");
        int n = scan.nextInt();

        generatepattern(n);
    }
    static void generatepattern(int n){
        for(int i=1;i<=n;i++){            //Loop for generating spaces
            for(int space=n-i;space>=0;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i=1;i<=n;i++){
            //Loop for generating spaces
            for(int space=0;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=n-i;j>=1;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
