package linkedList1.Assignment;

import java.util.Scanner;
import java.util.Stack;

/*You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1
-1
Sample Output 2 :
false
true
Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.

For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.*/
public class PalindromeLinkedList {

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

    public static boolean checkPalindrome(Node<Integer> head) {
        var currentNode = head;
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<>();

//        Traverse the given list from head to tail and push every visited node to stack.
        while (currentNode != null) {
            stack.push((Integer) currentNode.data);
            currentNode = currentNode.next;
        }
//        Traverse the list again. For every visited node, pop a node from the stack and compare data of popped node with the currently visited node.
//        If all nodes matched, then return true, else false.
        while (head != null) {
            int poppedNode = stack.pop();
            if (head.data == poppedNode) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeLLInput();
        System.out.println(checkPalindrome(head));
    }
}
