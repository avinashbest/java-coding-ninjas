package queues;

public class Node<generic> {
    generic data;
    Node<generic> next;

    public Node(generic data) {
        this.data = data;
    }
}
