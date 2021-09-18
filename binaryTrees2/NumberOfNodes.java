package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

public class NumberOfNodes {

    /*
     * Time Complexity: O(n)
     * */
    public static int noOfNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        return 1 + noOfNodes(root.left) + noOfNodes(root.right);
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        System.out.println("Number of Nodes = " + noOfNodes(root));
    }
}
