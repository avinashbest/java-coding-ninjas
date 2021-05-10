package recursion3;

import java.util.Arrays;
import java.util.Scanner;

/*Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf*/
public class ReturnKeypadCombination {

    public static String[] returnKeypad(int number) {
        if (number == 0) {
            return new String[]{" "};
        }
        String[] smallAnswer = returnKeypad(number / 10);
        String[] singleDigitOutput = helperFunction(number % 10);
        String[] answer = new String[singleDigitOutput.length * smallAnswer.length];
        int k = 0;
        for (int i = 0; i < singleDigitOutput.length; i++) {
            for (int j = 0; j < smallAnswer.length; j++) {
                answer[k] = smallAnswer[j] + singleDigitOutput[i];
                k++;
            }
        }
        return answer;
    }

    public static String[] helperFunction(int n) {
        if (n < 2) {
            System.exit(0);
        } else if (n == 2) {
            return new String[]{"a", "b", "c"};
        } else if (n == 3) {
            return new String[]{"d", "e", "f"};
        } else if (n == 4) {
            return new String[]{"g", "h", "i"};
        } else if (n == 5) {
            return new String[]{"j", "k", "l"};
        } else if (n == 6) {
            return new String[]{"m", "n", "o"};
        } else if (n == 7) {
            return new String[]{"p", "q", "r", "s"};
        } else if (n == 8) {
            return new String[]{"t", "u", "v"};
        } else {
            return new String[]{"w", "x", "y", "z"};
        }
        return new String[]{""};
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = returnKeypad(n);
        Arrays.sort(arr);
        printArray(arr);
    }
}
