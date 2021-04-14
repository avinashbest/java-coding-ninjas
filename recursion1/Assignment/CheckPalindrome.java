package recursion1.Assignment;

import java.util.Scanner;

/*Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
ninja
Sample Output 2:
false*/
public class CheckPalindrome {

    public static boolean palindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return palindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(palindrome(str));
    }
}
