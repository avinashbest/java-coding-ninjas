package recursion3.Assignment;

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
public class ReturnPermutationString {

    public static String[] returnPermutation(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }

        String[] smallOutput = returnPermutation(str.substring(1));
        String[] output = new String[str.length() * smallOutput.length];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            String currentString = smallOutput[i];
            for (int j = 0; j <= currentString.length(); j++) {
                output[k] = currentString.substring(0, j) + str.charAt(0) + currentString.substring(j);
                k++;
            }
        }
        return output;
    }

    public static void displayArray(String[] str) {
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] string = returnPermutation(str);
        displayArray(string);
    }
}
