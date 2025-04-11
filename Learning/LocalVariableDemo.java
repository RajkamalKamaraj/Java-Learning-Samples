package Learning;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a =5;
        System.out.println("Value of a=" + a);
        print(a);
        System.out.println("Value of a=" + a);
    }
    public static void print(int x){
        int a = ++x;
        System.out.println("value of aa="+ a);

    }
}
