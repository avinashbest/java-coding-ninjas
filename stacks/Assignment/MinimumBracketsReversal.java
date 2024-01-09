package stacks.Assignment;

import java.util.Stack;

/*For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
Example:
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

Expression: {{{
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
Input Format :
The first and the only line of input contains a string expression, without any spaces in between.
Output Format :
The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
Note:
You don't have to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1:
{{{
Sample Output 1:
-1
Sample Input 2:
{{{{}}
Sample Output 2:
1*/
public class MinimumBracketsReversal {

    public static int countBracketsReversals(String expression) {
        if (expression.length() == 0) {
            return 0;
        }

        if (expression.length() % 2 != 0) {
            return -1; // Only even numbers of brackets can be balanced
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char currentCharacter = expression.charAt(i);

            if (currentCharacter == '{') {
                stack.push(currentCharacter);
            } else {
//                pop if there is a balanced pair
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(currentCharacter);
                }
            }
        }

        int count = 0;

//        only unbalanced brackets are there in stack now
        while (!stack.isEmpty()) {
            char char1 = stack.pop();
            char char2 = stack.pop();
            /*when char1 = } and char2 = {, then we need to reverse both of them so count will increase by 2*/
            if (char1 != char2) {
                count += 2;
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBracketsReversals("{{{{}}"));
    }
}
