package strings.Assignment;

import java.util.Scanner;

/*For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.
Example:
str1= "sinrtg"
str2 = "string"
The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.
The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.
You are not required to print anything. It has already been taken care of. Just implement the function.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.
Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false*/
public class CheckPermutation {

    public static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        /*We’ll maintain a frequency array of 256 size (256 being the number of characters that have an ASCII code) and initialize all elements of this array to 0.*/
        int[] frequency = new int[256];
        /*frequency[str[i]] will store the frequency of the character in str1 that has an ASCII code of (int)str[i]1.*/
        /*Then we’ll iterate through both strings and update the frequency array. This update process will be a little different.*/
        for (int i = 0; i < str1.length(); i++) {
            int asciiCodeOfCorrespondingCharacter = (int) str1.charAt(i);
            /*For the first string, we’ll increase the frequency of current character by 1 and for the second string, we’ll decrease the frequency of current character by 1.*/
            frequency[asciiCodeOfCorrespondingCharacter] = 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            int asciiCode = (int) str2.charAt(i);
            frequency[asciiCode] = 0;
        }
        /*This will result in the frequency array have all 0s if the two strings are permutations of each other. Otherwise, at least one element in the frequency array will be non-zero.*/
        for (int j : frequency) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
/*
        String str1 = "abcde";
        String str2 = "baedc";
*/
        System.out.println(checkPermutation(str1, str2));

    }
}
