package recursion2;

import java.util.Scanner;

/*Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz*/
public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String answer = "";
        if (str.charAt(0) != str.charAt(1)) {
            answer += str.charAt(0);
        }
        String smallAnswer = removeDuplicates(str.substring(1));
        return answer + smallAnswer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(removeDuplicates(str));
    }
}
