package linkedList2;

import java.util.Scanner;

/*Mid Point Linked List

For a given singly linked list of integers, find and return the node present at the middle of the list.
Note :
If the length of the singly linked list is even, then return the first middle node.

Example: Consider, 10 -> 20 -> 30 -> 40 is the given list, then the nodes present at the middle with respective data values are, 20 and 30. We return the first node with data 20.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 Output Format :
For each test case/query, print the data value of the node at the middle of the given list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 -1
Sample Output 1 :
3
Sample Input 2 :
2
-1
1 2 3 4 -1
Sample Output 2 :
2*/
public class MidPointOfLinkedList {
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

    public static Node<Integer> midPointOfList(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
//        using 2 pointer approach, slowPointer moves by node 1 and fastPointer moves with twice the speed of slowPointer
        var slowPointer = head;
        var fastPointer = head.next;

        while (fastPointer != null/* for odd LL condition*/ && fastPointer.next != null/*for even LL condition*/) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        printList(head);
        System.out.print("Mid point of the List: ");
        var midPoint = midPointOfList(head);
        System.out.println(midPoint.data);
    }
}
