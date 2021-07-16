package queues.Assignment;

import java.util.LinkedList;
import java.util.Queue;

/*You have been given a queue that can store integers as the data. You are required to write a function that reverses the populated queue itself without using any other data structures.
Example:
Alt txt

Alt txt

Input Format:
The first list of input contains an integer 't' denoting the number of test cases/queries to be run.
Then the test cases follow.

The first line input for each test case/query contains an integer N, denoting the total number of elements in the queue.

The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.
Output Format:
For each test case/query, the only line of output prints the order in which the queue elements are dequeued, all of them separated by a single space.

Output for every test case/query will be printed on a new line.
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.*/
public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.size() <= 1) {
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            queue.add((int) Math.floor(Math.random() * (99 - 10 + 1) + 10));
        }

        System.out.println(queue.toString());
        reverseQueue(queue);
        System.out.println(queue.toString());

    }
}
