package arrays;

import java.util.Scanner;

public class passingArrayToFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        size of the array to be created
        int size = scan.nextInt();
        int[] arr = new int[size];
//        taking input to array from the user
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
//        printing the array elements to the console
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
