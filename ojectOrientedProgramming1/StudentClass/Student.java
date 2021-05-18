package ojectOrientedProgramming1.StudentClass;

public class Student {
    public String name;
    final private int rollNumber;
    double cgpa;
    final double cgpaConversionFactor = 0.95;


    /*CONSTRUCTOR*/
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    /*GETTERS*/
    public int getRollNumber() {
        return this.rollNumber;
    }

    /*SETTERS*/
    public void setName(String name) {
        if (name.length() <= 3) {
            return;
        }
        System.out.println(this);
        this.name = name;
    }

    public void print() {
        System.out.println(name + "\t" + rollNumber);
    }
}
