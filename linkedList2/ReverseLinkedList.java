package linkedList2;

import java.util.Scanner;

class DoubleNode {
    Node<Integer> head;
    Node<Integer> tail;

    public DoubleNode() {
    }

    public DoubleNode(Node<Integer> head, Node<Integer> tail) {
        this.head = head;
        this.tail = tail;
    }
}

public class ReverseLinkedList {

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

    /*public static Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> reverseHead = reverseLinkedList(head.next);
        Node<Integer> tmp = reverseHead;
//        traversing to the last node of new head return by recursion
        while (tmp.next != null) {
            tmp = tmp.next;
        }
//        pointing the 2nd last node to head of list which will be the last node after reverse
        tmp.next = head;
//        making head.next pointer to null
        head.next = null;
//        returning the new head of the reverse list
        return reverseHead;
    }*/

    /*public static DoubleNode reverseLinkedListOptimised(Node<Integer> head) {
        DoubleNode answer;
        if (head == null || head.next == null) {
            answer = new DoubleNode();
            answer.head = head;
            answer.tail = head;
            return answer;
        }
        DoubleNode reverseHead = reverseLinkedListOptimised(head.next);
        reverseHead.tail.next = head;
        head.next = null;

        answer = new DoubleNode();
        answer.head = reverseHead.head;
        answer.tail = head;

        return answer;
    }

    public static Node<Integer> reverseLinkedList(Node<Integer> head){
        DoubleNode result = reverseLinkedListOptimised(head);
        return result.head;
    }*/

    public static Node<Integer> reverseLinkedListBest(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> reverseHead = reverseLinkedListBest(head.next);
        Node<Integer> reversedTail = head.next;
        reversedTail.next = head;
        head.next = null;
        return reverseHead;
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
        head = reverseLinkedListBest(head);
        printList(head);
    }
}
