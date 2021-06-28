package stacks;

public class StackUsingArrays {

    private int[] data;
//    index of the top-most element
    private int top;

    public StackUsingArrays() {
        data = new int[10];
        top = -1;
    }

    public void push(int element) {
//        if the stack is full
        if (top == data.length - 1) {
            doubleCapacity();
        }
        data[++top] = element;
    }

    private void doubleCapacity() {
        System.out.println("Doubling the Capacity...");
        int[] tmp = data;
        data = new int[2 * tmp.length];

        for (int i = 1; i < tmp.length; i++) {
            data[i] = tmp[i];
        }
    }

    public int size() {
        return top + 1;
    }

    public int top() {
//        stack is empty
        if (top == -1) {
            throw new IllegalArgumentException("Stack Underflow");
        }
        return data[top++];
    }

    public int pop() {
//        stack is empty
        if (top == -1) {
            throw new IllegalArgumentException("Stack Underflow");
        }
        /*int tmp = data[top];
        top -= 1;
        return tmp;*/
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
