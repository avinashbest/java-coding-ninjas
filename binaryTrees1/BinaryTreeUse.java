package binaryTrees1;

import java.util.Scanner;

public class BinaryTreeUse {

    /* Root -> Left -> Right: Traversal on Binary Tree */
    public static void printBinaryTree(BinaryTreeNode<Integer> root) {
//        Base Case: if the root is null we just return from that position without doing anything
        if (root == null) return;
        System.out.println(root.data);
        printBinaryTree(root.left);
        printBinaryTree(root.right);
    }

    /* Root -> Left -> Right: Traversal on Binary Tree */
    public static void printBinaryTreeDetailed(BinaryTreeNode<Integer> root) {
//        Base Case: if the root is null we just return from that position without doing anything
        if (root == null) return;
//        At this point we only know root is not null
        System.out.print(root.data + " : ");
//        Printing for the root's left & right data
        if (root.left != null) System.out.print("Left -> " + root.left.data + ", ");
        if (root.right != null) System.out.print("Right -> " + root.right.data);
        System.out.println();
//        Now, calling recursively on root's left and root's right
        printBinaryTreeDetailed(root.left);
        printBinaryTreeDetailed(root.right);
    }

    public static void main(String[] args) {
//        Creating the nodes
        var root = new BinaryTreeNode<>(1);

        var rootLeft = new BinaryTreeNode<>(2);
        var rootRight = new BinaryTreeNode<>(3);
//        connecting the nodes
        root.left = rootLeft;
        root.right = rootRight;
//        first part of tree created

//        second part is creating
        var twoRight = new BinaryTreeNode<>(4);
        var threeLeft = new BinaryTreeNode<>(5);

        rootLeft.right = twoRight;
        rootRight.left = threeLeft;

        printBinaryTreeDetailed(root);
    }
}
