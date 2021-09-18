package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

public class RemoveLeafNodes {

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return null;
//        if root is leaf then return null as the root
        if (root.left == null && root.right == null) return null;
//        root's left will be removeLeafNodes on root.left & similar for root's right
        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);
        return root;
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("------------------------The Tree is-------------------------");
        printBinaryTree(root);
        System.out.println("------------------------------------------------------------");
        root = removeLeafNodes(root);
        System.out.println("----------The Tree is, After removal of leaf nodes----------");
        System.out.println("------------------------------------------------------------");
        printBinaryTree(root);
    }
}
