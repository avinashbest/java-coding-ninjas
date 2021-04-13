package recursion1;

import java.util.Scanner;

public class CheckSortedArray {
    public static boolean checkSorted(int[] arr) {
        if (arr.length <= 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        /*breaking the bigger array into smaller array everytime*/
        int[] smallArr = new int[arr.length - 1];
        /*copying the array*/
        for (int i = 1; i < arr.length; i++) {
            smallArr[i - 1] = arr[i];
        }
        return checkSorted(smallArr);
    }

    /*this functions check whether the array is sorted or in the range startIndex to arr.length*/
    private static boolean checkSortedOptimised(int[] arr, int startIndex) {
        /*if there is only one element which is obviously sorted by default*/
        if (startIndex >= arr.length - 1) {
            return true;
        }
        /*if first element is of the array is greater than the second element its obviously sorted.*/
        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }
        return checkSortedOptimised(arr, startIndex + 1);
    }

    /*Recursion and the helper function*/
    public static boolean checkSortedOptimised(int[] arr) {
        return checkSortedOptimised(arr, 0);
    }


    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Size of the Array? ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(checkSortedOptimised(arr));
    }
}
