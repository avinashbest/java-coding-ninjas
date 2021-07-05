package queues;

public class QueueUse {
    public static void main(String[] args) {
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

    }
}
