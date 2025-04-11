package CESession;

public class Test {
    public static void main(String[] args) {
         System.out.println("Hello");
        System.out.println(-10>>1);
        System.out.println(-10>>>1);

        //Relational
        char x;
        System.out.println('a'=='a');
        System.out.println('a'=='b');
        System.out.println(false == false);
        System.out.println(3.0 == 3L);
        System.out.println(x = 'a');
        System.out.println('a'!='a');
        System.out.println(2!=3);

        int y=10, z =20;
        System.out.println(x>y);
        System.out.println(x<=y);
        System.out.println(y>=z);
        System.out.println(y<z);

        int a = 1;
        System.out.println((a++<0)&&(a-->0));
        System.out.println(a);

        System.out.println((a++<0)^(a-->0));
    }
}
