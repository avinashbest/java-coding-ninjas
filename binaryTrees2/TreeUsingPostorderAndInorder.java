package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;

public class TreeUsingPostorderAndInorder {

    private static BinaryTreeNode<Integer> buildTreeHelper(
            int[] postOrder,
            int postOrderStart,
            int postOrderEnd,
            int[] inOrder,
            int inOrderStart,
            int inOrderEnd
    ) {
        if (postOrderStart > postOrderEnd || inOrderStart > inOrderEnd) return null;

        int rootValue = postOrder[postOrderEnd];
        var root = new BinaryTreeNode<Integer>(rootValue);

//        Find root element index from inOrder[]
        int k = 0;
        for (int i = inOrderStart; i <= inOrderEnd; i++) {
            if (rootValue == inOrder[i]) {
                k = i;
                break;
            }
        }
//        Recursion: Handling later on
        root.left = buildTreeHelper(postOrder, postOrderStart, (postOrderStart + k - inOrderStart) - 1, inOrder, inOrderStart, k - 1);
        root.right = buildTreeHelper(postOrder, postOrderStart + k - inOrderStart, postOrderEnd - 1, inOrder, k + 1, inOrderEnd);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        return buildTreeHelper(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static int[] takingInput(String listName) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of the list " + listName + ": ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] postOrder = takingInput("Postorder");
        int[] inOrder = takingInput("Inorder");
        System.out.println("Processing Binary Tree: Building the Tree...");
        var root = buildTree(postOrder, inOrder);
        System.out.println("--------------------------------------------");
        printBinaryTree(root);
    }
}
