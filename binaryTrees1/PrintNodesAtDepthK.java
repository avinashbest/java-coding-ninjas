package binaryTrees1;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

public class PrintNodesAtDepthK {

    public static void printNodeAtDepthK(BinaryTreeNode<Integer> root, int K) {
        if (root == null) return;
        if (K == 0) {
            System.out.println(root.data);
            return;
        }
//        the distance of depth ignore root is 1 smaller in left subtree and right subtree
        printNodeAtDepthK(root.left, K - 1);
        printNodeAtDepthK(root.right, K - 1);
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Depth to print: ");
        int K = scan.nextInt();
        printNodeAtDepthK(root, K);
    }
}
