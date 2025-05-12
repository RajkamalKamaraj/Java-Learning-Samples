package Learning.Oops;

//Demo of using "final" - The other classes can not inherit from the class Example
// "Remove the final keyword program will execute.
/*final*/ public class inheritanceDemo2 {
    protected String brand = "Bajaj";        // attribute
    public void honk() {                    // Vehicle method
        System.out.println("Ring...Ring...!");
    }
}

class Bike extends inheritanceDemo2{
    public static void main(String[] args) {
        String brand = "Hero";        // Vehicle attribute
        inheritanceDemo2 bike = new inheritanceDemo2();
        bike.honk();
        System.out.println("Model name displayed through the Object :" + bike.brand );
        System.out.println("Model name displayed without the Object :" + brand );
    }
}

