package linkedList2.Assignment;

import java.util.Scanner;

/*You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
 Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M

Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9
Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
Sample Output 2 :
10 30 20 40
90 80 90 25 65 85 70 */
public class SwapTwoNodesInLinkedLIst {
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

    public static Node<Integer> swapList(Node<Integer> head, int i, int j) {
        if (i == j) {
            return head;
        }

        Node<Integer> currentNode = head, prev = null;
        Node<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;

        int position = 0;

        while (currentNode != null) {
            if (position == i) {
                firstNodePrev = prev;
                firstNode = currentNode;
            } else if (position == j) {
                secondNodePrev = prev;
                secondNode = currentNode;
            }
            prev = currentNode;
            currentNode = currentNode.next;
            position++;

        }

        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;
        } else {
            head = secondNode;
        }

        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        } else {
            head = firstNode;
        }

        var currentFirstNode = secondNode.next;
        secondNode.next = firstNode.next;
        firstNode.next = currentFirstNode;

        return head;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var head = takeLinkedListInput();
        System.out.print("Enter the i-th position to swap: ");
        int i = scan.nextInt();
        System.out.print("Enter the j-th position to swap: ");
        int j = scan.nextInt();
        head = swapList(head, i, j);
        printList(head);
    }
}
