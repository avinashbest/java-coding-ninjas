package ojectOrientedProgramming1.StudentClass;

public class Student {
    public String name;
    private int rollNumber;

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
}
