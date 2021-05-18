package ojectOrientedProgramming1.StudentClass;

public class Student {
    public String name;
    private int rollNumber;

    /*GETTERS*/
    public int getRollNumber() {
        return rollNumber;
    }

    /*SETTERS*/
    public void setRollNumber(int r) {
        if (r <= 0) {
            return;
        }
        rollNumber = r;
    }
}
