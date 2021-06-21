package stacks;

public class StackUse {
    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
