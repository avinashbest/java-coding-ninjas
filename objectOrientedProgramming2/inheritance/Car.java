package objectOrientedProgramming2.inheritance;

public class Car extends Vehicle{
    int numberOfDoors;

    public void printCar() {
        System.out.println("Inside Car, " + "Color = " + color + ", Max Speed = " + maxSpeed + ", Number of Doors = " + numberOfDoors);
    }
}
