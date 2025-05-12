package Learning.Oops;

public class LaptopClass {
    String LapName = "Int-72";
    float cost = 85999.99f;
    String Company = "Dell";
    int count = 10;

    void performance(){
        System.out.println("Laptop is working fine!");
    }

    void speed(){
        System.out.println("Laptop working speed little bit slow!");
    }

    public static void main(String[] args) {
        int name;
        LaptopClass L = new LaptopClass();
        LaptopClass L1 = new LaptopClass();
        L.performance();
        L.speed();
        L.count = 25;
        System.out.println(L.count);
        L = L1;
        System.out.println(L);
        System.out.println(L1);
    }
}
