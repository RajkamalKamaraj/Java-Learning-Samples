package Learning.Methods;

import static java.nio.file.Files.move;

public class Sample {
    static class Animal {
        void move(){
            System.out.println("Animal runs..");
        }
    }
    static class Dog extends Animal{
        @Override
        void move() {
            super.move();
            System.out.println("Dog runs fast...");
        }
    }
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.move();
    }

}
