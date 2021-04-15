package recursion2;

import java.util.Scanner;

/*Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd*/
public class ReplaceCharacter {

    public static String replaceCharacter(String str, int startIndex, char c1, char c2) {
        if (str.isEmpty()) {
            return str;
        }
        String answer = "";
        if (str.charAt(startIndex) == c1) {
            answer = answer + c2;
        } else {
            answer = answer + str.charAt(startIndex);
        }
        String smallAnswer = replaceCharacter(str.substring(startIndex + 1), c1, c2);
        return answer + smallAnswer;
    }


    public static String replaceCharacter(String str, char c1, char c2) {
        return replaceCharacter(str, 0, c1, c2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c1 = scan.next().charAt(0);
        char c2 = scan.next().charAt(0);
        System.out.println(replaceCharacter(str, c1, c2));
    }
}
