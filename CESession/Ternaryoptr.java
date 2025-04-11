package CESession;

public class Ternaryoptr {
    public static void main(String[] args) {
        int a=10,b=20,c=30,res;
        res = a>b ? (a>c ? a:c):(b>c?b:c);
        System.out.println(res);

        System.out.println(a&=5);
    }
}
