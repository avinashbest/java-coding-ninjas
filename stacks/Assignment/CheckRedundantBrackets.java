package stacks.Assignment;

import java.util.Stack;

/*Given a single string mathematical expression, return true if
redundant brackets are present in the expression. Brackets are redundant if
there is nothing inside the bracket or more than one pair of brackets are present.
Assume the given string expression is balanced and contains only one type of
bracket i.e. ().
Sample Input:
((a+b))
(a+b)
Sample Output:
true
false*/
public class CheckRedundantBrackets {

    private static boolean find(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    public static boolean checkRedundant(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                boolean hasOperator = false;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    hasOperator = true;
                }

                if (!hasOperator) {
                    return true;
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkRedundant("((a+b))"));
    }
}
