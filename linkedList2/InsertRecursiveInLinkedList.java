package linkedList2;

import java.util.Scanner;

public class InsertRecursiveInLinkedList {

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

    public static Node<Integer> insertNodeRecursively(Node<Integer> head, int position, int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null && position > 0) {
            return head;
        }
//        insertion of newNode at the beginning of the linked list
        if (position == 0) {
            newNode.next = head;
            return newNode; // returning newNode as the new head of the linked list
        }
//        recursion will return us the head of the list, so we are attaching it to our list
        head.next = insertNodeRecursively(head.next, position - 1, data);
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
        System.out.print("Enter the Value: ");
        int value = scan.nextInt();
        insertNodeRecursively(head, position, value);
        printList(head);
    }
}
