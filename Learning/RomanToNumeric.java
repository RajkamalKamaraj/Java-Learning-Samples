package Learning;

import java.util.HashMap;
import java.util.Scanner;

class RomanToNumeric {
    public static void main(String[] args) {
        System.out.println("Enter a value:");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        HashMap<Character, Integer> rmntonumeral = new HashMap<Character,Integer>();
        rmntonumeral.put('I',1);
        rmntonumeral.put('V',5);
        rmntonumeral.put('X',10);
        rmntonumeral.put('L',50);
        rmntonumeral.put('C',100);
        rmntonumeral.put('D',500);
        rmntonumeral.put('M',1000);

        int res=0;
        System.out.println(rmntonumeral.size());
        for(int i=0;i<s.length();i++){

        }

//        for(Integer i : rmntonumeral.values()){
//            System.out.println(i);
//        }
    }
}