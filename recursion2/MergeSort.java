package recursion2;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
        //Calculating the size of the leftSubArray and rightSubArray
        int n1 = midIndex - startIndex + 1;
        int n2 = endIndex - midIndex;
        //Creating arrays leftSubArray[0,1,2,- - -,(n1+1)] and rightSubArray[0,1,2,- - -,(n2+1)]
        int[] leftSubArray = new int[n1 + 1];
        int[] rightSubArray = new int[n2 + 1];
        //Copying elements of the array from original array to left and right sub array
        for (int i = 0; i < n1; i++) {
            leftSubArray[i] = arr[startIndex + i];
        }
        for (int j = 0; j < n2; j++) {
            rightSubArray[j] = arr[midIndex + j + 1];
        }
        //Making last element of the array be Infinite
        leftSubArray[n1] = Integer.MAX_VALUE;
        rightSubArray[n2] = Integer.MAX_VALUE;
        //Counter for leftSubArray & rightSubArray respectively
        int i = 0, j = 0;
        //Comparing to sort and Merging the sub-arrays and copying into the original array
        for (int k = startIndex; k <= endIndex; k++) {
            if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k] = leftSubArray[i];
                i++;
            } else {
                arr[k] = rightSubArray[j];
                j++;
            }
        }
    }
    /*Merge-sort: Divide & Conquer -> Time Complexity(worst): O(n*logn), Space Complexity: O(n)*/
    public static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            //Dividing the array into 2 parts until we have only 1 element.
            mergeSort(arr, startIndex, midIndex);
            mergeSort(arr, midIndex + 1, endIndex);
            //Merging the divided array into sorted order
            merge(arr, startIndex, midIndex, endIndex);
        }
    }

    public static int[] takeArrayInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            /*arr[i] = scan.nextInt();*/
            arr[i] = (int) Math.floor(Math.random() * (999 - 100 + 1) + 100);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the Array?");
        int[] arr = takeArrayInput();
        System.out.println("Array before sorting:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array After sorting:");
        printArray(arr);
    }
}
