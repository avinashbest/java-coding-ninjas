package queues;

public class QueueUse {
    public static void main(String[] args) {
        System.out.println("Queue using Arrays");
        QueueUsingArrays queue = new QueueUsingArrays();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.dequeue());

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println("Queue using Linked List");
        QueueUsingList<Integer> q = new QueueUsingList<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.dequeue());

        System.out.println(q.isEmpty());
        System.out.println(q.size());

        System.out.println("Queue using Stacks");
        QueueUsingTwoStacks s = new QueueUsingTwoStacks();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s.pop());
        System.out.println(s.top());

        System.out.println(s.pop());
        System.out.println(s.top());

        System.out.println(s.pop());
        System.out.println(s.top());

        System.out.println(s.isEmpty());
        System.out.println(s.getSize());
    }
}
