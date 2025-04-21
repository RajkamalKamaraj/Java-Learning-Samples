package Learning;

import java.util.Collections;

import static java.util.Collections.reverse;

public class ReverseStr {
    public static void main(String[] args) {
        String str1="appa";
        System.out.println(reverse(str1));
    }
    static String reverse(String in){
        if(in==null){
            throw new IllegalArgumentException(in + " is not a valid input");
        }
        StringBuilder out = new StringBuilder();
        char chars[] = in.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--)
            out.append(chars[i]);

        return out.toString();
    }
}
