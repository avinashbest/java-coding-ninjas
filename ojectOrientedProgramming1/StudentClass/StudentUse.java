package ojectOrientedProgramming1.StudentClass;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Avinash Kumar";
        s1.setRollNumber(191041);
        System.out.println(s1);
        System.out.println(s1.name + "\t" + s1.getRollNumber());
    }
}
