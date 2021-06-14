package linkedList1.Assignment;

import java.util.Scanner;

/*You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line contains the integer value 'N'. It denotes the number of nodes to be moved from last to the front of the singly linked list.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
0 <= N < M
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
2
1 2 3 4 5 -1
3
10 20 30 40 50 60 -1
5
Sample Output 1 :
3 4 5 1 2
20 30 40 50 60 10
Sample Input 2 :
1
10 6 77 90 61 67 100  -1
4
Sample Output 2 :
90 61 67 100 10 6 77
 Explanation to Sample Input 2 :
We have been required to move the last 4 nodes to the front of the list. Here, "90->61->67->100" is the list which represents the last 4 nodes. When we move this list to the front then the remaining part of the initial list which is, "10->6->77" is attached after 100. Hence, the new list formed with an updated head pointing to 90.*/
public class AppendLastNToFirst {
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

    public static void printLinkedList(Node<Integer> head) {
        Node<Integer> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    private static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if (n == 0 || head == null) {
            return head;
        }

        Node<Integer> nextNode = head;
        Node<Integer> previousNode = head;
//        making point the nextNode to the n-th node of the list
        for (int i = 0; i < n; i++) {
            nextNode = nextNode.next;
        }

//        making the previous node to point just before the previous the nextNode
        while (nextNode.next != null) {
            previousNode = previousNode.next;
            nextNode = nextNode.next;
        }

        Node<Integer> tmp = previousNode.next;
//        assigning the last node to be null
        previousNode.next = null;
//        (n-th) connecting to the(n-th + 1) node
        nextNode.next = head;
//        returning the new head of the list as tmp
        return tmp;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = scan.nextInt();
        head = appendLastNToFirst(head, N);
        printLinkedList(head);
    }
}
