package arrays;

import java.util.Scanner;

public class passingArrayToFunctions {

    public static int[] takingInput() {
        Scanner scan = new Scanner(System.in);
//        size of the array to be created
        int size = scan.nextInt();
        int[] arr = new int[size];
//        taking input to array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
//        printing the array elements to the console
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = takingInput();
        displayArray(arr);
    }
}
