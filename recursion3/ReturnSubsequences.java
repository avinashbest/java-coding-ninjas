package recursion3;

import java.util.Scanner;

public class ReturnSubsequences {

    public static String[] findSubsequences(String str) {
        if (str.length() == 0) {
            return new String[]{" "};
        }
        String[] smallAnswer = findSubsequences(str.substring(1));
        String[] answer = new String[2 * smallAnswer.length];
        for (int i = 0; i < smallAnswer.length; i++) {
            answer[i] = smallAnswer[i];
        }
        for (int i = 0; i < smallAnswer.length; i++) {
            answer[i + smallAnswer.length] = str.charAt(0) + smallAnswer[i];
        }
        return answer;
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] arr = findSubsequences(str);
        printArray(arr);
    }
}
