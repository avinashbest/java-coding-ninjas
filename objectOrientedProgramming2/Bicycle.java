package objectOrientedProgramming2;

public class Bicycle extends Vehicle {

    public Bicycle(String color, int maxSpeed) {
        super(color, maxSpeed);
        System.out.println("Bicycle's Constructor");
    }

    public Bicycle(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Bicycle's Constructor");
    }
}
