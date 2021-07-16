package queues;

public class QueueUsingArrays {
    private int[] data;
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
            doubleCapacity();
        }
        if (size == 0) {
            front++;
        }
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    private void doubleCapacity() {
        int[] tmp = data;
        data = new int[tmp.length * 2];

        int index = 0;
        for (int i = front; i < tmp.length; i++) {
            data[index++] = tmp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = tmp[i];
        }
        front = 0;
        rear = tmp.length - 1;
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
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return tmp;
    }
}
