package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
Note: If array size is even, take first mid as root.
Input format:
The first line of input contains an integer, which denotes the value of n. The following line contains n space separated integers, that denote the values of array.
Output Format:
The first and only line of output contains values of BST nodes, printed in pre order traversal.
Constraints:
Time Limit: 1 second
Sample Input 1:
7
1 2 3 4 5 6 7
Sample Output 1:
4 2 1 3 6 5 7
*/
public class ConvertSortedArrayToBST {

    public static TreeNode<Integer> constructBST(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }

    public static TreeNode<Integer> helper(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        var tmp = new TreeNode<Integer>(arr[mid]);
        tmp.left = helper(arr, start, mid - 1);
        tmp.right = helper(arr, mid + 1, end);

        return tmp;
    }

    public static void main(String[] args) {
        var arr = takeArrayInput();
        System.out.println("Processing BST...");
        var root = constructBST(arr);
        levelWisePrintBinaryTree(root);
    }

    public static int[] takeArrayInput() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void levelWisePrintBinaryTree(TreeNode<Integer> root) {
        if (root == null) return;

        Queue<TreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            var front = pendingChildren.remove();
            if (front == null) {
                if (!pendingChildren.isEmpty()) {
                    pendingChildren.add(null);
                }
            } else {
                System.out.print(front.data + " : Left -> ");

                if (front.left != null) {
                    pendingChildren.add(front.left);
                    System.out.print(front.left.data + ", Right -> ");
                } else {
                    System.out.print("null" + ", Right -> ");
                }

                if (front.right != null) {
                    pendingChildren.add(front.right);
                    System.out.print(front.right.data);
                } else {
                    System.out.print("null");
                }
            }
            System.out.println();
        }
    }
}
