package objectOrientedProgramming2;

public class Car extends Vehicle{
    int numberOfDoors;

    public Car(int numberOfDoors, int maxSpeed) {
        super(maxSpeed);
        System.out.println("Car's Constructor");
        this.numberOfDoors = numberOfDoors;
    }

    public void printCar() {
        super.print();
        System.out.println("Inside Car, " + ", Number of Doors = " + numberOfDoors);
    }
}
