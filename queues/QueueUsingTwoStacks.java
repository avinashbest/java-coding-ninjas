package queues;

import java.util.LinkedList;
import java.util.Queue;

/*Implement a Stack Data Structure specifically to store integer data using two Queues.
There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.
Implement the following public functions :
1. Constructor:
It initialises the data members as required.
2. push(data) :
This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
3. pop() :
It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
4. top :
It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
5. size() :
It returns the size of the stack at any given instance of time.
6. isEmpty() :
It returns a boolean value indicating whether the stack is empty or not.
Operations Performed on the Stack:
Query-1(Denoted by an integer 1): Pushes an integer data to the stack.

Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.

Query-4(Denoted by an integer 4): Returns the current size of the stack.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
Input Format:
The first line contains an integer 'q' which denotes the number of queries to be run against each operation in the stack.
Then the test cases follow.

Every 'q' lines represent an operation that needs to be performed.

For the push operation, the input line will contain two integers separated by a single space, representing the type of the operation in integer and the integer data being pushed into the stack.

For the rest of the operations on the stack, the input line will contain only one integer value, representing the query being performed on the stack.
Output Format:
For Query-1, you do not need to return anything.
For Query-2, prints the data being popped from the stack.
For Query-3, prints the data kept on the top of the stack.
For Query-4, prints the current size of the stack.
For Query-5, prints 'true' or 'false'(without quotes).

Output for every query will be printed in a separate line.
 Note:
You are not required to print anything explicitly. It has already been taken care of. Just implement the function.
Constraints:
1 <= q <= 100
1 <= x <= 5
-2^31 <= data <= 2^31 - 1 and data != -1

Where 'q' is the total number of queries being performed on the stack, 'x' is the range for every query and data represents the integer pushed into the stack. */
public class QueueUsingTwoStacks {
    public Queue<Integer> q1;
    public Queue<Integer> q2;

    public QueueUsingTwoStacks() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public int getSize() {
        return q1.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void push(int element) {
        q1.add(element);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        int ans = q1.poll();

        Queue<Integer> tmp = this.q1;
        this.q1 = this.q2;
        this.q2 = tmp;

        return ans;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int ans = q1.poll();
        q2.add(ans);

        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;

        return ans;
    }
}
