package Learning;

import java.io.IOException;
import java.util.Scanner;

public class Seriesofline {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < t; i++) {
            if (a != 0 && b != 0) {
                 a += (a + (2 ^ i) * b);
            }
            System.out.println(a);
        }
            in.close();

    }
}