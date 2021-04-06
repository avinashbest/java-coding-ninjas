package strings;

import java.util.Scanner;

/*Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format
String in a single line
Output format
Word wise reversed string in a single line
Constraints
0 = S = 10^7
where S represents the length of string, S.
Sample Input 1
Welcome to Coding Ninjas
Sample Output 1
Ninjas Coding to Welcome
Sample Input 2
Always indent your code
Sample Output 2
code your indent Always*/
public class ReverseStringWordWise {

    public static String reverseStringWordWise(String str) {
        String answer = "";
//        2 pointer pointing at the last character of the String
        int i = str.length() - 1/*to traverse the whole string in reverse order*/, j = str.length() - 1/*to mark the position if the first pointer i hits a space*/;
        for (; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                String reverseWord = "";
                /*Copying the character to answer string*/
                for (int k = i + 1; k <= j; k++) {
                    reverseWord += str.charAt(k);
                }
                answer += reverseWord + " ";
                /*2nd pointer will be assigned to the next limit for till which the character in answer string will be copied*/
                j = i - 1;
            }
        }
        /*handling the last word case because it don't have any space*/
        for (int k = i + 1; k <= j; k++) {
            answer += str.charAt(k);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(reverseStringWordWise(str));
    }
}
