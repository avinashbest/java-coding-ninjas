package linkedList2;

import java.util.Scanner;

public class MergeSortOnLinkedList {
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

    public static void printList(Node<Integer> head) {
        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static Node<Integer> findMidPointOfList(Node<Integer> head) {
        if (head == null) {
            return head;
        }

        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> mergeTwoSortedList(Node<Integer> list_1, Node<Integer> list_2) {
        if (list_1 == null) {
            return list_2;
        }

        if (list_2 == null) {
            return list_1;
        }

        Node<Integer> newHead = null, newTail = null;

        if (list_1.data < list_2.data) {
            newHead = list_1;
            newTail = list_1;
            list_1 = list_1.next;
        } else {
            newHead = list_2;
            newTail = list_2;
            list_2 = list_2.next;
        }

        while (list_1 != null && list_2 != null) {
            if (list_1.data < list_2.data) {
                newTail.next = list_1;
                newTail = newTail.next;
                list_1 = list_1.next;
            } else {
                newTail.next = list_2;
                newTail = newTail.next;
                list_2 = list_2.next;
            }
        }

        if (list_1 != null) {
            newTail.next = list_1;
        }
        if (list_2 != null) {
            newTail.next = list_2;
        }
        return newHead;
    }

    public static Node<Integer> mergeSortOnLinkedList(Node<Integer> head) {
//        size of list is 1 or 0 then it is already sorted.
        if (head == null || head.next != null) {
            return head;
        }
        var mid = findMidPointOfList(head);

        var half_1 = head;
        var half_2 = mid.next;
        mid.next = null;

        half_1 = mergeSortOnLinkedList(half_1);
        half_2 = mergeSortOnLinkedList(half_2);
        var finalHead = mergeTwoSortedList(half_1, half_2);

        return half_1;
    }

    public static void main(String[] args) {
        var head = takeLLInput();
        System.out.println("Sorted List: ");
        head = mergeSortOnLinkedList(head);
        printList(head);
    }
}
