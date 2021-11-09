package binarySearchTree2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RootToNodePathBinaryTree {

    private static ArrayList<Integer> nodeToRootPath(TreeNode<Integer> root, int x) {
        if (root == null) return null;

        if (root.data == x) {
            var result = new ArrayList<Integer>();
            result.add(x);
            return result;
        }

        var left = nodeToRootPath(root.left, x);
        if (left != null) {
            left.add(root.data);
            return left;
        }

        var right = nodeToRootPath(root.right, x);
        if (right != null) {
            right.add(root.data);
            return right;
        }

        return null;
    }


    public static void main(String[] args) {
        var root = levelWiseInput();
        System.out.print("Enter the value of X: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(nodeToRootPath(root, x));
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
