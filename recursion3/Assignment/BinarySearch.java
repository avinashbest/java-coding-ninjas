package recursion3.Assignment;

import java.util.Scanner;

/*Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8
5
Sample Output:
3
*/
public class BinarySearch {

    public static int binarySearch(int[] arr, int searchQuery, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == searchQuery) {
                return mid;
            } else if (arr[mid] < searchQuery) {
                return binarySearch(arr, searchQuery, mid+1, end);
            }
            return binarySearch(arr, searchQuery, start, mid-1);
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int searchQuery) {
        return binarySearch(arr, searchQuery, 0, arr.length - 1);
    }

    public static int[] takingInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 6, 8};
        int searchQuery = 5;
        System.out.println(binarySearch(arr, searchQuery));
    }
}
