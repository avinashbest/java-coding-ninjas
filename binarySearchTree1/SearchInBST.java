package binarySearchTree1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Given a BST and an integer k. Find if the integer k is present in given BST or not. You have to return true, if node with data k is present, return false otherwise.
Note: Assume that BST contains all unique elements.
Input Format:
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.
The following line of input contains an integer, that denotes the value of k.
Output Format:
The first and only line of output contains a boolean value. Print true, if node with data k is present, print false otherwise.
Constraints:
Time Limit: 1 second
Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1 :
true
Sample Input 2 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
12
Sample Output 2 :
false
*/
public class SearchInBST {

    public static boolean searchInBST(TreeNode<Integer> root, int target) {
        if (root == null) return false;

        if (root.data == target) return true;
        else if (root.data > target) return searchInBST(root.left, target);
        else return searchInBST(root.right, target);
    }


    public static void main(String[] args) {
        var root = levelWiseInput();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the item to search: ");
        int target = scan.nextInt();
        if(searchInBST(root, target)) System.out.println("Item Found :)");
        else System.out.println("Item Not Found :(");
    }

    public static TreeNode<Integer> levelWiseInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Root's Data: ");
        int rootData = scan.nextInt();

        if (rootData == -1) return null;

        var root = new TreeNode<>(rootData);

        Queue<TreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            var front = pendingChildren.remove();

            System.out.print("Enter left child of " + front.data + ": ");
            int leftData = scan.nextInt();
            if (leftData != -1) {
                var leftChild = new TreeNode<>(leftData);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }

            System.out.print("Enter right child of " + front.data + ": ");
            int rightData = scan.nextInt();
            if (rightData != -1) {
                var rightChild = new TreeNode<>(rightData);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }
}
