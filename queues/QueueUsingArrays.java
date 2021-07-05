package queues;

public class QueueUsingArrays {
    private final int[] data;
    private int front; // index of the element @ the front end of the queue
    private int rear; // index of the element @ the last end of the queue
    private int size;

    public QueueUsingArrays() {
        data = new int[5];
        front = -1;
        rear = -1;
    }

    public QueueUsingArrays(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (size == data.length) {
            throw new IllegalArgumentException("Queue is Full");
        }
        if (size == 0) {
            front++;
        }
        rear++;
        data[rear] = element;
        size++;
    }

    public int front() {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        return data[front];
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        int tmp = data[front];
        front++;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return tmp;
    }
}
