package Learning.Iterative;

import java.util.Scanner;

//Sum and average for 5 numbers
public class ForloopDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int count=1;count<=5;count++){
            System.out.print("Enter a number"+count+"=");
            int number = scan.nextInt();
            sum = sum+number;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (float) sum/5);

    }
}
