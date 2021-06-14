package linkedList1;

import java.util.Scanner;

/*IYou have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
 Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
Note :
Assume that the Indexing for the singly linked list always starts from 0.

If the position is greater than the length of the singly linked list, you should return the same linked list without any change.
 Illustration :
The following images depict how the insertion has been taken place.
Image-I :
Alt txt

Image-II :
Alt txt

Image-III :
Alt txt

Image-IV :
Alt txt

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the linked list separated by a single space.

The second line contains the two integer values of 'data' and 'pos' separated by a single space, respectively
Reminder/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case, print the resulting singly linked list of integers in a row, separated by a single space.

Output for every test case will be printed in a separate line.
 Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
pos >= 0
Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 100
Sample Output 1 :
3 4 5 100 2 6 1 9
Sample Input 2 :
2
3 4 5 2 6 1 9 -1
0 20
10 98 7 66 8 -1
5 99
Sample Output 2 :
20 3 4 5 2 6 1 9
10 98 7 66 8 99 */
public class InsertNodeInLL {

    public static Node<Integer> takeLLInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("Press -1: To stop taking input in linked list.");
        System.out.println("==============================================");
        System.out.print("Enter Values: ");
        int data = scan.nextInt();
        Node<Integer> headNode = null;
//        temporary node to keep track of last Node, which will further connect to new node
        Node<Integer> lastNode = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (headNode == null) {
//                make the currentNode as headNode node
                headNode = currentNode;
            } else {
                lastNode.next = currentNode;
            }
//            So, that currentNode and lastNode point the same location.
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

    public static Node<Integer> insertNodeInLL(Node<Integer> head, int position, int data) {
        Node<Integer> newNode = new Node<>(data);
//        insertion of newNode at the beginning of the linked list
        if (position == 0) {
            newNode.next = head;
            return newNode; // returning newNode as the new head of the linked list
        }
        int currentPosition = 0;
        Node<Integer> tmp = head;
        while (tmp != null && currentPosition < (position - 1)) {
            tmp = tmp.next;
            currentPosition++;
        }
//        to avoid null pointer exception we are checking tmp != null
        if (tmp != null) {
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
        return head;
    }

    public static Node<Integer> deleteNodeLL(Node<Integer> head, int position) {
        if (head == null) { //Special case 1
            return head;
        }

        if (position == 0) { //Special case 2
            return head.next;
        }

        int currentPosition = 0;
        Node<Integer> currentNode = head;
//       We go till (position - 1) because we want to land on the node that comes just before
        while (currentNode != null && currentPosition < (position - 1)) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        if (currentNode == null || currentNode.next == null) {  //Special case 3
            return head;
        }

        currentNode.next = currentNode.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Press 0: Exit.");
        System.out.println("Press 1: To create a new linked list.");
        System.out.println("Press 2: Insert element in the linked list.");
        System.out.println("Press 3: Delete element in the linked list.");
        System.out.println("Press 4: Print the linked list.");
        System.out.println("===========================================");
        int choice;
        do {
            System.out.print("Enter Choice: ");
            choice = scan.nextInt();
            if (choice == 1) {
                head = takeLLInput();
            } else if (choice == 2) {
                System.out.print("Enter Position: ");
                int position = scan.nextInt();

                System.out.print("Enter Value: ");
                int data = scan.nextInt();

                head = insertNodeInLL(head, position, data);
                System.out.println("Insertion Successful!");
            } else if (choice == 3) {
                System.out.print("Enter Position: ");
                int position = scan.nextInt();

                head = deleteNodeLL(head, position);
                System.out.println("Deletion Successful!");
            } else if (choice == 4) {
                printLinkedList(head);
            }
        } while (choice != 0);
    }
}

/*===========================================
Press 0: Exit.
Press 1: To create a new linked list.
Press 2: Insert element in the linked list.
Press 3: Delete element in the linked list.
Press 4: Print the linked list.
===========================================
Enter Choice: 1
==============================================
Press -1: To stop taking input in linked list.
==============================================
Enter Values: 10 20 30 40 50 60 70 80 90 100 -1
Enter Choice: 4
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90 -> 100 ->
Enter Choice: 3
Enter Position: 9
Deletion Successful!
Enter Choice: 4
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90 ->
Enter Choice: 2
Enter Position: 9
Enter Value: 100
Insertion Successful!
Enter Choice: 4
10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> 80 -> 90 -> 100 ->
Enter Choice: 0*/