package Learning;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Test{
    public static void main(String[] args) {
//        int j[][] = new int[4][];
//        j[0] = new int[]{0,1,3};
//        j[1] = new int[]{6,4};
//        j[2] = new int[]{1,7,6,8,9};
//        j[3] = new int[]{5};
//
//        System.out.println(j[2][2] == j[1][0]);
        String[] str = {"10","5","100"};
        Arrays.sort(str);
        for(String s: str)
            System.out.println(s);
    }
}
