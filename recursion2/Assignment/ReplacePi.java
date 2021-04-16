package recursion2.Assignment;

import java.util.Scanner;

/*Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
Sample Input 1 :
xpix
Sample Output :
x3.14x
Sample Input 2 :
pipi
Sample Output :
3.143.14
Sample Input 3 :
pip
Sample Output :
3.14p*/
public class ReplacePi {
    public static String replacePi(String str) {
        String answer = "";
        if (str.length() <= 1) {
            return str;
        }
        String smallAnswer = replacePi(str.substring(1));
        if (str.charAt(0) == 'p' && smallAnswer.charAt(0) == 'i') {
            answer = "3.14" + smallAnswer.substring(1);
        } else {
            answer = str.charAt(0) + smallAnswer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(replacePi(str));
    }
}
