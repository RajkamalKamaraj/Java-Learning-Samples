package Learning;
//Note: Static variable storage location is "Class Area"
public class StaticVariableDemo {
    static int staticvariable;
    public static void main(String[] args) {
        System.out.println("Static Variable = " + staticvariable);
        StaticVariableDemo obj1 = new StaticVariableDemo();
        obj1.display();
        StaticVariableDemo obj2 = new StaticVariableDemo();
        obj2.display();
        //Should be noted here for the life time
        obj1.display();
        obj2.display();

    }
    public void display(){
        staticvariable = staticvariable+1;
        System.out.println("Value of Static variable is "+staticvariable);
    }
}
