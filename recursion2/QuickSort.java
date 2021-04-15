package recursion2;

import java.util.Scanner;

public class QuickSort {
    /*Utility function to swap elements of the array*/
    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    /*partition function of the quick sort*/
    public static int partition(int[] arr, int startIndex, int endIndex) {
        /*considering the 1st element of the array to be pivot (say) we can take anyone in randomize quick sort*/
        int pivotElement = arr[startIndex];
        int i = startIndex;
        /*dividing the array into 2 parts such that, left side would be less than to pivot element and right side of the pivot element is greater than that.*/
        for (int j = startIndex + 1; j <= endIndex; j++) {
            if (arr[j] <= pivotElement) {
                i++;
                swap(arr, j, i);/*swap(arr[j], arr[i]);*/
            }
        }
        /*placing the pivot element to its correct position i.e b/w less than and greater than element which divides the array as 2 parts virtually*/
        swap(arr, startIndex, i);/*swap(arr[startIndex], arr[i]);*/
        return i;
    }

    /*Quick-sort: Divide & Conquer -> Time Complexity(worst): O(n^2), Time Complexity(on average): O(n*logn), Space Complexity for call stack (recursion): O(n)*/
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int indexOfPivotElement = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, indexOfPivotElement - 1);
            quickSort(arr, indexOfPivotElement + 1, endIndex);
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
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After sorting:");
        printArray(arr);
    }
}
