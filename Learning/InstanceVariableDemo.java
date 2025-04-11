package Learning;

public class InstanceVariableDemo {
    //static int instancevar;
    int instancevar;
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Value of a =" + a);
        //System.out.println("Instance variable = " + instancevar);// can not call inside a static method, because we need to make it as static
        InstanceVariableDemo obj1 = new InstanceVariableDemo();
        obj1.print();

        InstanceVariableDemo obj2 = new InstanceVariableDemo();
        obj2.print();
    }
    public void print(){ //Non static method
        int x = 6;
        System.out.println("x="+x);
        System.out.println("Instance Variable = "+ ++instancevar);
    }
}
