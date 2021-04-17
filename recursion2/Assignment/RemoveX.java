package recursion2.Assignment;

import java.util.Scanner;

/*Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S.
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:*/
public class RemoveX {
    public static String removeX(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String answer = "";
        if (str.charAt(0) != 'x') {
            answer += str.charAt(0);
        }
        String smallAnswer = removeX(str.substring(1));
        return answer + smallAnswer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(removeX(str));
    }
}
