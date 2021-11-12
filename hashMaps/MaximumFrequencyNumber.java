package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

/*You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains most frequent element in the given array.
Constraints:
0 <= N <= 10^8
Time Limit: 1 sec
Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6
Sample Output 1 :
2
Sample Input 2 :
3
1 4 5
Sample Output 2 :
1*/
public class MaximumFrequencyNumber {

    private static int maximumFrequencyNumber(int[] arr) {
        var map = new HashMap<Integer, Integer>();
//        Storing frequency of each element of array in hashMap
        for (int i : arr) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }

        int maxFrequency = 0, answer = Integer.MIN_VALUE;
        for (int i : arr) {
            if (map.get(i) > maxFrequency) {
                maxFrequency = map.get(i);
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        var arr = takeArrayInput();
        System.out.println(maximumFrequencyNumber(arr));
    }

    private static int[] takeArrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) arr[i] = scan.nextInt();
        return arr;
    }
}
