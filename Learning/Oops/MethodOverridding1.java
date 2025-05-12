package Learning.Oops;

class Parent{
    void display(){
        System.out.println("I am a Parent!");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("I am a Child!");
    }
}
public class MethodOverridding1 {
    public static void main(String[] args) {
        Parent P = new Child();
        Child d = new Child();
        d.display();
        P.display();
    }
}
