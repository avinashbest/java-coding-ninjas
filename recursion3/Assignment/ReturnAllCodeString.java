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
public class ReturnAllCodeString {

    public static char getChar(int n) {
        return (char) (96 + n);
    }

    public static String[] returnCodeString(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }
        int firstDigit = (str.charAt(0) - '0');
        String[] smallOutput1 = returnCodeString(str.substring(1));
        String[] smallOutput2 = new String[0];

        int firstTwoDigits = 0;
        if (str.length() >= 2) {
            firstTwoDigits = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
            if (firstTwoDigits > 10 && firstTwoDigits <= 26) {
                smallOutput2 = returnCodeString(str.substring(2));
            }
        }
        String output[] = new String[smallOutput1.length + smallOutput2.length];
        int k = 0;
        for (String s : smallOutput1) {
            char firstDigitChar = getChar(firstDigit);
            output[k] = firstDigitChar + s;
            k++;
        }
        for (String s : smallOutput2) {
            char firstTwoDigitChar = getChar(firstTwoDigits);
            output[k] = firstTwoDigitChar + s;
            k++;
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
        String[] string = returnCodeString(str);
        displayArray(string);
    }
}
