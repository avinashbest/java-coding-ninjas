package binaryTrees1;

import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;
import static binaryTrees1.BinaryTreeInput.printBinaryTree;

public class NodeWithLargestData {

    public static int nodeWithLargestData(BinaryTreeNode<Integer> root) {
        if (root == null) return -1;
        int largestLeft = nodeWithLargestData(root.left);
        int largestRight = nodeWithLargestData(root.right);
//        comparing three number which one is maximum
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        System.out.println("Node with Largest Data: " + nodeWithLargestData(root));
    }
}
