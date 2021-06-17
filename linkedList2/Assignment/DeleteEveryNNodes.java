package linkedList2.Assignment;

import java.util.Scanner;

/*You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'M,' and 'N,' respectively. A single space will separate them.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= P <= 10^5
Where P is the size of the singly linked list.
0 <= M <= 10^5
0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
2 2
Sample Output 1 :
1 2 5 6
Sample Input 2 :
2
10 20 30 40 50 60 -1
0 1
1 2 3 4 5 6 7 8 -1
2 3
Sample Output 2 :
1 2 6 7
Explanation of Sample Input 2 :
For the first query, we delete one node after every zero elements hence removing all the items of the list. Therefore, nothing got printed.
For the second query, we delete three nodes after every two nodes, resulting in the final list, 1 -> 2 -> 6 -> 7.*/
public class DeleteEveryNNodes {

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

    public static Node<Integer> deleteEveryNNodes(Node<Integer> head, int M, int N) {
        if (M == 0 || head == null) {
            return null;
        }
        if (N == 0) {
            return head;
        }

        Node<Integer> currentNode = head;
        Node<Integer> tmp = null;

        while (currentNode != null) {
            int take = 0;
            int skip = 0;

            while (currentNode != null && take < M) {
                if (tmp == null) {
                    tmp = currentNode;
                } else {
                    tmp.next = currentNode;
                    tmp = currentNode;
                }
                currentNode = currentNode.next;
                take++;
            }

            while (currentNode != null && skip < N) {
                currentNode = currentNode.next;
                skip++;
            }
        }
        if (tmp != null) {
            tmp.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var head = takeLinkedListInput();
        System.out.print("Enter the value of M: ");
        int M = scan.nextInt();
        System.out.print("Enter the value of N: ");
        int N = scan.nextInt();
        head = deleteEveryNNodes(head, M, N);
        printList(head);
    }
}
