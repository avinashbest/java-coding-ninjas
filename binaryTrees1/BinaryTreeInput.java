package binaryTrees1;

import java.util.Scanner;

public class BinaryTreeInput {

    public static BinaryTreeNode<Integer> takeTreeInputDetailed(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.print("Enter the root's data: ");
        } else {
            if (isLeft) System.out.print("Enter left child of " + parentData + ": ");
            else System.out.print("Enter right child of " + parentData + ": ");
        }
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        if (data == -1) {
            return null;
        }
        var root = new BinaryTreeNode<Integer>(data);
        root.left = takeTreeInputDetailed(false, data, true);
        root.right = takeTreeInputDetailed(false, data, false);

        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.print("Enter the root data: ");
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
//        if the user don't want to build the tree, or he wants null tree
        if (data == -1) return null;
//        creating a root node with the input data
        var root = new BinaryTreeNode<Integer>(data);
//        Now, Recursion will build the leftSubTree and rightSubTree
        var leftChild = takeTreeInput();
        var rightChild = takeTreeInput();
//        connecting the root's left to leftChild of the tree
        root.left = leftChild;
//        connecting the root's right to rightChild of the tree
        root.right = rightChild;
//        returning the root node of the tree
        return root;
    }

    /* Root -> Left -> Right: Traversal on Binary Tree */
    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;
        System.out.print(root.data + " : ");
        if (root.left != null) System.out.print("Left -> " + root.left.data + ", ");
        if (root.right != null) System.out.print("Right -> " + root.right.data);
        System.out.println();
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    public static void main(String[] args) {
//        var root = takeTreeInput();
//        System.out.println("----------The Tree is----------");
//        printBinaryTree(root);

        var root = takeTreeInputDetailed(true, 0, true); // only isRoot is true other doesn't matter we'll handle those in the method
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
    }

}
