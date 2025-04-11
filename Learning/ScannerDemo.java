package Learning;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Year of Birth:");
        int year = scan.nextInt();
        System.out.print("Enter your Month of Birth:");
        int month = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Name:");
        String name = scan.nextLine();
        int age = 2025 - year;
        System.out.println(name + "age is "+ age);
    }
}
