package Learning.Oops;

import org.w3c.dom.ls.LSOutput;

public class inheritanceDemo1 { //this is a Vehicle class
    protected String brand = "Tata";        // attribute
    public void honk() {                    // Vehicle method
        System.out.println("Ring...Ring...!");
    }
}

class car extends inheritanceDemo1{
    public static void main(String[] args) {
        String brand = "Tata";        // Vehicle attribute
        inheritanceDemo1 car = new inheritanceDemo1();
        car.honk();
        System.out.println(car.brand + " " + "Model name");
    }
}
