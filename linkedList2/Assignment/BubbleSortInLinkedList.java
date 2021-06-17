package linkedList2.Assignment;

import java.util.Scanner;

/*Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
3 4 5 6 7 8 9 10
Sample Output 2:
2
-1
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 */
public class BubbleSortInLinkedList {
    public static Node<Integer> takeLinkedListInput() {
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

    private static int listLength(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static Node<Integer> bubbleSortOnLinkedList(Node<Integer> head) {
        int n = listLength(head);
        for (int i = 0; i < (n - 1); i++) {
            Node<Integer> prev = null;
            Node<Integer> current = head;
            for (int j = 0; j < (n - i - 1); j++) {
                if (current.data <= current.next.data) {
                    prev = current;
                    current = current.next;
                } else {
                    if (prev == null) {
                        var fwd = current.next;
                        head = head.next;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    } else {
                        var fwd = current.next;
                        prev.next = fwd;
                        current.next = fwd.next;
                        fwd.next = current;
                        prev = fwd;
                    }
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        var head = takeLinkedListInput();
        System.out.println("Bubble Sort on Linked List:");
        head = bubbleSortOnLinkedList(head);
        printList(head);
    }
}
