package binaryTrees1;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

public class NumberOfLeafNodes {

    public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
//        if the root is leaf node then we return 1
        if (root.left == null && root.right == null) return 1;
//        other we ask recursion to add the leaves on left and right side and return them
        return noOfLeafNodes(root.left) + noOfLeafNodes(root.right);
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        System.out.println("Number of leaves nodes = " + noOfLeafNodes(root));
    }
}
