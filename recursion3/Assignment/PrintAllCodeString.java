package recursion3.Assignment;

import java.util.Scanner;

/*Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format :
A numeric string S
Output Format :
All possible codes in different lines
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw*/
public class PrintAllCodeString {

    public static char getChar(int n) {
        return (char) (96 + n);
    }

    private static void returnCodeString(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }
        int firstDigit = str.charAt(0) - '0';
        returnCodeString(str.substring(1), answer + getChar(firstDigit));
        if (str.length() > 1) {
            int firstTwoDigits = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
            if (firstTwoDigits > 10 && firstTwoDigits <= 26) {
                returnCodeString(str.substring(2), answer + getChar(firstTwoDigits));
            }
        }
    }

    private static void returnCodeString(String str) {
        returnCodeString(str, "");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        returnCodeString(str);
    }


}
