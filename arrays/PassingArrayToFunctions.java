package arrays;

import java.util.Scanner;

public class PassingArrayToFunctions {

    public static int largestInArray(int[] arr) {
//        assigned the -infinity to max, such that it would the smallest among every element in the array
        int max = Integer.MIN_VALUE;
//        iterating over the whole array and comparing which element is greater than max if greater then max would be assigned with that element
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

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
        System.out.println("Largest element of the array is " + largestInArray(arr));
    }
}
