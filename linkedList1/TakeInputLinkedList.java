package linkedList1;

import java.util.Scanner;

public class TakeInputLinkedList {

    public static Node<Integer> takeLLInput() {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node<Integer> headNode = null;
//        temporary node to keep track of last Node, which will further connect to new node
        Node<Integer> lastNode = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (headNode == null) {
//                make the currentNode as headNode node
                headNode = currentNode;
            } else {
                lastNode.next = currentNode;
            }
//            So, that currentNode and lastNode point the same location.
            lastNode = currentNode; // lastNode = lastNode.next
            data = scan.nextInt();
        }
        return headNode;
    }

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        printLinkedList(head);
    }
}
