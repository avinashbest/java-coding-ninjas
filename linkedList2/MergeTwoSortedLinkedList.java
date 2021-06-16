package linkedList2;

import java.util.Scanner;

/*Merge Two Sorted LL

You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
Note :
Try solving this in O(1) auxiliary space.

No need to print the list, it has already been taken care.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the first sorted singly linked list separated by a single space.

The second line of the input contains the elements of the second sorted singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output :
For each test case/query, print the resulting sorted singly linked list, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t = 10^2
0 <= N <= 10 ^ 4
0 <= M <= 10 ^ 4
Where N and M denote the sizes of the singly linked lists.

Time Limit: 1sec
Sample Input 1 :
1
2 5 8 12 -1
3 6 9 -1
Sample Output 1 :
2 3 5 6 8 9 12
Sample Input 2 :
2
2 5 8 12 -1
3 6 9 -1
10 40 60 60 80 -1
10 20 30 40 50 60 90 100 -1
Sample Output 2 :
2 3 5 6 8 9 12
10 10 20 30 40 40 50 60 60 60 80 90 100*/
public class MergeTwoSortedLinkedList {
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

    public static void main(String[] args) {
        System.out.println("#################");
        System.out.println("Input the List 1:");
        System.out.println("#################");
        var list_1 = takeLLInput();
        System.out.println("#################");
        System.out.println("Input the List 2:");
        var list_2 = takeLLInput();
        System.out.println("#################");
        System.out.println("Merged List:");
        var result = mergeTwoSortedList(list_1, list_2);
        printList(result);
    }
}
