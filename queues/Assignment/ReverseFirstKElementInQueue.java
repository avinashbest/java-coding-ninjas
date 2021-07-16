package queues.Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*For a given queue containing all integer data, reverse the first K elements.
You have been required to make the desired change in the input queue itself.
Example:
alt txt

For the above input queue, if K = 4 then after reversing the first 4 elements, the queue will be updated as:
alt txt

Input Format :
The first line of input would contain two integers N and K, separated by a single space. They denote the total number of elements in the queue and the count with which the elements need to be reversed respectively.

The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.
Output Format:
The only line of output prints the updated order in which the queue elements are dequeued, all of them separated by a single space.
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.*/
public class ReverseFirstKElementInQueue {

    public static Queue<Integer> reverseKElement(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size()) {
            return queue;
        }

        if (k <= 0) {
            return queue;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size(); i++) {
            queue.add(queue.poll());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.add((int) Math.floor(Math.random() * (99 - 10 + 1) + 10));
        }

        System.out.println(queue.toString());
        reverseKElement(queue, 3);
        System.out.println(queue.toString());
    }
}
