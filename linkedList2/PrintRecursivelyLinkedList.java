package linkedList2;

import java.util.Scanner;

public class PrintRecursivelyLinkedList {

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

    public static void printReverseLL(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " -> ");
        printReverseLL(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        printReverseLL(head);
    }
}
