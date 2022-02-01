package hashMaps.Assignment;

import java.util.HashMap;

/*Longest subset zero-sum

Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format
The first and only line of output contains length of the longest subarray whose sum is zero.
Constraints:
0 <= N <= 10^8
Time Limit: 1 sec
Sample Input 1:
10
 95 -97 -387 -435 -5 -70 897 127 23 284
Sample Output 1:
5
Explanation:
The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897
* */
public class LongestSubsetZeroSum {

    private static int longestSubsetZeroSum(int[] arr) {
        var map = new HashMap<Integer, Integer>();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        int len = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (len < i + 1) {
                    len = i + 1;
                }
            } else if (map.containsKey(arr[i])) {
                if (len < i - map.get(arr[i]))
                    len = i - map.get(arr[i]);
            } else {
                map.put(arr[i], i);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestSubsetZeroSum(new int[]{95, -97, -387, -435, -5, -70, 897, 127, 23, 284}));
    }
}
