
package Codechef;
import java.util.Scanner;

public class RunforFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int restStops = (y - 1) / x;
        System.out.println(restStops);
    }
}
