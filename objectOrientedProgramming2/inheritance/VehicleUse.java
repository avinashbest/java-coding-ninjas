package objectOrientedProgramming2.inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        var vehicle = new Vehicle();
        vehicle.color = "RED";
        vehicle.print();

        var car = new Car();
        car.color = "BLACK";
        car.maxSpeed = 160;
        car.numberOfDoors = 4;
        car.print();
        car.printCar();

        var bicycle = new Bicycle();
        bicycle.color = "BLUE";
        bicycle.maxSpeed = 40;
        bicycle.print();
    }
}
