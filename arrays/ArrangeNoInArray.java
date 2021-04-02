package arrays;

import java.util.Scanner;

/*Arrange Numbers in Array

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note:
You need not print the array. You only need to populate it.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains an integer 'N'.
Output Format :
For each test case, print the elements of the array/list separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2*/
public class ArrangeNoInArray {
    /*How to approach?
To arrange the numbers in the given sequence, we can continue by taking 2 indices one from start(i) and the other from the end(j). Start with number =1, print it on the first index(i), then increment the number and index i, now print the number on the last index(j), again increment the number and decrement j, print number on the 2nd index(i) and so on continue till i crosses j.*/
    public static void arrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int counter = 1;

        while (left <= right) {
            if (counter % 2 == 1) {
                arr[left] = counter;
                counter++;
                left++;
            } else {
                arr[right] = counter;
                counter++;
                right--;
            }
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases != 0) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            arrangeArray(arr);
            displayArray(arr);
            testCases--;
        }
    }
}
