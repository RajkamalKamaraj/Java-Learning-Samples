package Learning;

import java.util.Scanner;

public class RecursionDemo {
    static void fact(int x){
        int res=1;
        for(int i =1;i<=x;i++){
            res = res*i;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value to be factorial:");
        int n = scan.nextInt();
        fact(n);
    }
}
