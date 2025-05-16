package DataStructure.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExmp3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter a max numbers of names : ");
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();

        for(int i=0;i<max;i++){
            System.out.println("Enter a name,");
            String s = sc.next();
            names.add(s);
        }

        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }
}
