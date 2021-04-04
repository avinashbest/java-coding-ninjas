package searchingAndSorting;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
/*
    SELECTION-SORT(A)
  1.      // INPUT: A[1 . . . n], an array of any n numbers is unknown order
  2.      Integer i, j, min
  3.      for i = 1 to n - 1
  4.          do min = i
  5.            for j = i to n
  6.              do if A[j] < A[m]
  7.              then min = j
  8.            swap A[i] <-> A[min]
*/
        //finding the minimum element in the unsorted arr[i . . . n-1]
        //Assuming the minIndex is the 1st element
        int i, j, minIndex;
        for (i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            //test against elements after i to find the smallest
            for (j = i + 1; j < arr.length; j++) {
                //if this element is less, then it is the new minimum
                if (arr[j] < arr[minIndex]) {
                    //found new minimum, remember its index
                    minIndex = j;
                }
            }
            if (minIndex != i) {
//                swap(arr[i], arr[minIndex])
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
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
