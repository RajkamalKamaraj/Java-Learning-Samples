package Learning.Methods;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        System.out.println(sum(120,450));
        System.out.println(sum(12.75,45.40));
        short a =5987,b=2456;
        System.out.println(sum(a,b));
    }
    static int sum(int a,int b){
        return (a+b);
    }
    static double sum(double a,double b){
        return (a+b);
    }
//    static short sum(int a,int b){
//        return (a+b);
//    }
}
