package searchingAndSorting.Assignment;

import java.util.Scanner;

/*You have been given a random integer array/list(ARR) of size N. You have been required to push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain the relative order of the non-zero elements.
Note:
Change in the input array/list itself. You don't need to return or print the elements.

You need to do this in one scan of array only. Don't use extra space.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains an integer 'N' representing the size of the array/list.
Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the elements of the array/list in the desired order separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
2 0 0 1 3 0 0
Sample Output 1:
2 1 3 0 0 0 0
 Explanation for the Sample Input 1 :
All the zeros have been pushed towards the end of the array/list. Another important fact is that the order of the non-zero elements have been maintained as they appear in the input array/list.
Sample Input 2:
2
5
0 3 0 2 0
4
9 0 0 8 2
Sample Output 2:
3 2 0 0 0
9 8 2 0 0 */
public class PushZerosToEnd {
/*So let’s use a two pointer approach to solve this problem. We’ll maintain two pointers, ‘current’ and ‘nonZeroPos’. ‘current’ will be used to iterate through the array and ‘nonZeroPos’ will be used to decide the next position where the next non zero element will go to. Both pointers will be initialised with 0.
Now, we’ll iterate through the array. If we encounter a 0, we’ll just increase ‘current’ by 1. However, if we encounter a non-zero value, we put that element to ‘nonZeroPos’ and bring ‘nonZeroPos’s element to the current index. Basically we’re doing swap(arr[current], arr[nonZeroPos]) . And after this, we’ll increase both ‘current’ and ‘nonZeroPos’ by 1. This will ensure that every non-zero element gets pushed towards the front of the array with their order maintained.*/
    public static void pushZeroToEnd(int[] arr) {
        int current = 0;
        int nonZeroElementPosition = 0;
        while (current < arr.length) {
            if (arr[current] != 0) {
//                swap(arr[current], arr[nonZeroPos])
                int tmp = arr[current];
                arr[current] = arr[nonZeroElementPosition];
                arr[nonZeroElementPosition] = tmp;
                nonZeroElementPosition++;
            }
            current++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static int[] takeArrayInput() {
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
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int[] arr = takeArrayInput();
            pushZeroToEnd(arr);
            printArray(arr);
            testCases--;
        }
    }
}
