package objectOrientedProgramming2;

public class Vehicle {
    private String color;
    protected int maxSpeed;

    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle's Constructor");
    }

    public Vehicle(int maxSpeed) {
        System.out.println("Vehicle's Constructor");
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Inside Vehicle, " + "Color = " + color + ", Max Speed = " + maxSpeed);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
