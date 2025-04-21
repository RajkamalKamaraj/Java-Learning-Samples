package Learning.SwitchCase;

import java.util.Scanner;

public class VowelDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter");
        char ltr = scan.next().charAt(0);
        //System.out.println(ltr);
        switch (ltr){
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println( ltr + " " +" is Consonants");
        }
    }
}
