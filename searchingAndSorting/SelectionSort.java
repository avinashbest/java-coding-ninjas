package searchingAndSorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
/*
  1.      INPUT: A[1 . . . n], an array of any n numbers is unknown order
  2.      Integer i, j, min
  3.      for i = 1 to n - 1
  4.          do min = i
  5.            for j = i to n
  6.              do if A[j] < A[m]
  7.              then min = j
  8.            swap A[i] <-> A[min]
*/
        for (int i = 0; i < arr.length - 1; i++) {
            int minimumElement = arr[i];
            int minimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minimumElement) {
                    minimumElement = arr[j];
                    minimumIndex = j;
                }
            }
            if (minimumIndex != i) {
                arr[minimumIndex] = arr[i];
                arr[i] = minimumElement;
            }
        }
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 6, 7, 4, 5};
        selectionSort(arr);
        printArray(arr);
    }
}
