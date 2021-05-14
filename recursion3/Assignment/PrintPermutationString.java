package recursion3.Assignment;

import java.util.ArrayList;
import java.util.Scanner;
/*Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Input Format :
String S
Output Format :
All permutations (in different lines)
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba*/
public class PrintPermutationString {

    private static ArrayList<String> answer = new ArrayList<>();

    public static ArrayList<String> findPermutation(String str) {
        /*convert string to character array*/
        char[] arr = str.toCharArray();
        findPermutationHelper(arr, 0, arr.length - 1);
        return answer;
    }

    private static void findPermutationHelper(char[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            /*print the new permutation*/
            String permutation = "";
            for (int i = 0; i < arr.length; i++) {
                permutation += (arr[i]);
            }
            /*for printing in next line*/
            answer.add(permutation);
            return;
        }
        for (int i = startIndex; i <= endIndex; i++) {
            swap(arr, startIndex, i);
            findPermutationHelper(arr, startIndex + 1, endIndex);
            swap(arr, startIndex, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<String> permutation = findPermutation(str);
        System.out.println(permutation);
    }
}
