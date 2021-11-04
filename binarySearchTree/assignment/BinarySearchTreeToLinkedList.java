package binarySearchTree.assignment;

import binarySearchTree.TreeNode;

import static binarySearchTree.SearchInBST.levelWiseInput;
/*
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10
*/

class ListNode<T> {
    T data;
    ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
    }
}

class PairListNode {
    ListNode<Integer> head;
    ListNode<Integer> tail;
}

public class BinarySearchTreeToLinkedList {

    public static ListNode<Integer> constructLinkedList(TreeNode<Integer> root) {
        return helper(root).head;
    }

    private static PairListNode helper(TreeNode<Integer> root) {
        if (root == null) return new PairListNode();

        ListNode<Integer> newNode = new ListNode<>(root.data);

        var left = helper(root.left);
        var right = helper(root.right);

        PairListNode pair = new PairListNode();

        if (left.tail != null) {
            left.tail.next = newNode;
        }

        newNode.next = right.head;

        if (left.tail != null) {
            pair.head = left.head;
        } else {
            pair.head = newNode;
        }

        if (right.tail != null) {
            pair.tail = right.tail;
        } else {
            pair.tail = newNode;
        }

        return pair;
    }

    private static void printListNode(ListNode<Integer> head) {
        System.out.print("[ ");
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null ]");
    }

    public static void main(String[] args) {
        var root = levelWiseInput();

        System.out.println("Constructing the Linked List...");
        var head = constructLinkedList(root);

        System.out.println("The Linked List is:");
        printListNode(head);
    }
}
