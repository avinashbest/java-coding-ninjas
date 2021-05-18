package ojectOrientedProgramming1.StudentClass;

public class Student {
    public String name;
    private int rollNumber;

    /*CONSTRUCTOR*/
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "Avinash Kumar";
        this.rollNumber = 191041;
    }

    /*GETTERS*/
    public int getRollNumber() {
        return this.rollNumber;
    }

    /*SETTERS*/
    public void setRollNumber(int rollNumber) {
        if (rollNumber <= 0) {
            return;
        }
        System.out.println(this);
        this.rollNumber = rollNumber;
    }

    public void print() {
        System.out.println(name + "\t" + rollNumber);
    }
}
