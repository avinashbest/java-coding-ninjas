package stacks;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 9};

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for (int element : arr) {
            stack.push(element);
        }

        reverseStack(stack, helper);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    private static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if (input.size() <= 1) {
            return;
        }

        int lastElement = input.pop();

        reverseStack(input, extra);

        while (!input.isEmpty()) {
            int top = input.pop();
            extra.push(top);
        }
        input.push(lastElement);

        while (!extra.isEmpty()) {
            int top = extra.pop();
            input.push(top);
        }
    }
}
