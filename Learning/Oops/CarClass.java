package Learning.Oops;

public class CarClass {
    String Color = "White";
    String Brand = "Tata";
    int Yearofmodel = 2025;
    float cost = 850000f;

    void moveForward(){
        System.out.println("Car will move forward direction!");
    }

    void moveBackward(){
        System.out.println("Car can move Backward direction too...!");
    }

    public static void main(String[] args) {
        CarClass c1 = new CarClass();
        c1.moveForward();
        c1.moveBackward();
        System.out.println(c1.Color);
    }
}
