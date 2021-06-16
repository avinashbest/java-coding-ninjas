package linkedList2;

import java.util.Scanner;

public class DeleteRecursiveInLinkedList {
    public static Node<Integer> takeLLInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("Press -1: To stop taking input in linked list.");
        System.out.println("==============================================");
        System.out.print("Enter Values: ");
        int data = scan.nextInt();
        Node<Integer> headNode = null;
        Node<Integer> lastNode = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (headNode == null) {
                headNode = currentNode;
            } else {
                lastNode.next = currentNode;
            }
            lastNode = currentNode; // lastNode = lastNode.next
            data = scan.nextInt();
        }
        return headNode;
    }

    private static Node<Integer> deleteNodeRecursively(Node<Integer> head, int position) {
        if (head == null) {
            return head;
        }
//        if the position is 0 then we are returning the next node as the head, and the garbage collector delete the node
        if (position == 0) {
            return head.next;
        }

        head.next = deleteNodeRecursively(head.next, position - 1);
        return head;
    }

    public static void printList(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " -> ");
        printList(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Position: ");
        int position = scan.nextInt();
        head = deleteNodeRecursively(head, position);
        printList(head);
    }

}
