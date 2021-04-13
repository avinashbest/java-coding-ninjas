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
        System.out.println(checkSorted(arr));
    }
}
