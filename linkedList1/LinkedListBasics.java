package linkedList1;

public class LinkedListBasics {

    public static Node<Integer> createLinkedList() {
//        create node
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
//        linking node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        return head node
        return n1;
    }

    public static void printLinkedList(Node<Integer> head) {
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);

        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void incrementLinkedListData(Node<Integer> head) {
        Node<Integer> tmp = head;
        while (tmp != null) {
            tmp.data++;
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
    }

    public static int lengthOfLinkedList(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void printIthNode(Node<Integer> head, int index) {
//        NOTE: index starts from 0
        int count = 0;
        while (head != null && count < index) {
            count++;
            head = head.next;
        }
        if (head != null) {
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printLinkedList(head);
        System.out.println("Length of List = " + lengthOfLinkedList(head));
//        incrementLinkedListData(head);
        printIthNode(head, 2);
    }
}
