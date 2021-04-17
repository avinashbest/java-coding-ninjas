package recursion2.Assignment;

import java.util.Scanner;

/*Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
Constraints :
0 <= |S| <= 9
where |S| represents length of string S.
Sample Input 1 :
1231
Sample Output 1 :
1231
Sample Input 2 :
12567
Sample Output 2 :
12567*/
public class StringToInteger {

    public static int stringToInteger(String str) {
        if (str.length() == 1) {
            return str.charAt(0) - '0';
        }

        int firstNumber = str.charAt(0) - '0';
        int smallAnswer = stringToInteger(str.substring(1));
        return (int) ((firstNumber * Math.pow(10, str.length() - 1)) + smallAnswer);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(stringToInteger(str));
    }
}
