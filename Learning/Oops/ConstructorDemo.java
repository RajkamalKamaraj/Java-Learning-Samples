package Learning.Oops;

public class ConstructorDemo {
    String bikeName;
    int yrOfModel;
    float cost;

    // Default constructor
    public ConstructorDemo() {
        System.out.println("I am having a bike");
    }

    // Parameterized constructor
    public ConstructorDemo(String name, int model, float cost) {
//        this.bikeName = name;
//        this.yrOfModel = model;
//        this.cost = cost;
        System.out.println("My Bike name is " + name);
        System.out.println("My Bike model is " + model);
        System.out.println("My Bike cost is " + cost);
    }

    public static void main(String[] args) {
        // Creating object with default constructor
        ConstructorDemo B = new ConstructorDemo();
        B.bikeName = "Pulsar 150";
        B.yrOfModel = 2019;
        B.cost = 89999.99f;

        // Calling parameterized constructor by creating a new object
        ConstructorDemo B1 = new ConstructorDemo(B.bikeName, B.yrOfModel, B.cost);

        // Creating another object with a new set of parameters
        ConstructorDemo B2 = new ConstructorDemo("Yamaha", 1999, 75000);
        ConstructorDemo B3 = new ConstructorDemo();
    }
}
