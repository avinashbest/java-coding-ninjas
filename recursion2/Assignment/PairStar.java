package recursion2.Assignment;

import java.util.Scanner;

/*Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a*/
public class PairStar {

    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String smallAnswer = pairStar(str.substring(1));
        if (str.charAt(0) == str.charAt(1)) {
            smallAnswer = str.charAt(0) + "*" + str.charAt(1) + smallAnswer.substring(1);

        } else {
            smallAnswer = str.charAt(0) + smallAnswer;
        }
        return smallAnswer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(pairStar(str));
    }
}
