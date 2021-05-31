package objectOrientedProgramming2;

public class VehicleUse {
    public static void main(String[] args) {
        var vehicle = new Vehicle("RED", 140);
        vehicle.print();

        var car = new Car(4, 160);
        car.setColor("BLACK");
        car.print();
        car.printCar();

        var bicycle = new Bicycle("BLUE", 140);
        bicycle.print();
    }
}
