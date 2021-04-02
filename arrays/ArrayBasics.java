package arrays;

public class ArrayBasics {
    public static void main(String[] args) {
//        creating an integer array of size 10
        int[] intergerArray = new int[10];
//        intergerArray[0] = 10;
        System.out.println("Default value assigned to integer array is " + intergerArray[0]);

//        creating an character array of size 10
        char[] characterArray = new char[10];
//        characterArray[0] = 'a';
        System.out.println("Default value assigned to character array is " + characterArray[0] + "null character");

//        creating an double array of size 10
        double[] doubleArray = new double[10];
//        doubleArray[0] = 15.5;
        System.out.println("Default value assigned to double array is " + doubleArray[0]);
    }
}
