package binaryTrees2;

import binaryTrees1.BinaryTreeNode;

import static binaryTrees1.BinaryTreeInput.printBinaryTree;
import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;

/*For a given Binary of type integer, find and return the ‘Diameter’.
Diameter of a Tree
The diameter of a tree can be defined as the maximum distance between two leaf nodes.
Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.
Example:
alt txt

The maximum distance can be seen between the leaf nodes 8 and 9.
The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.
Input Format:
The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
Output Format:
The only line of output prints an integer, representing the diameter of the tree.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1
Sample Output 1:
9
Sample Input 2:
1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 2:
5*/

class DiameterToReturn {
    int diameter;
    int height;

    public DiameterToReturn(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}

public class DiameterOfBinaryTree {

    private static DiameterToReturn diameterHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new DiameterToReturn(0, 0);
        }
        var leftReturn = diameterHelper(root.left);
        var rightReturn = diameterHelper(root.right);

        int leftDiameter = leftReturn.diameter;
        int rightDiameter = rightReturn.diameter;

        int longestDistance = leftReturn.height + rightReturn.height + 1; // OPTION_1
        int diameter = Math.max(leftReturn.diameter, Math.max(rightReturn.diameter, longestDistance)); // OPTION_2
        int height = Math.max(leftReturn.height, rightReturn.height) + 1; // OPTION_3

        return new DiameterToReturn(diameter, height);
    }

    public static int diameterOfBinaryTreeOptimized(BinaryTreeNode<Integer> root) {
        var answer = diameterHelper(root);
        return answer.diameter;
    }


    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return 0;
        int option_1 = height(root.left) + height(root.right);
        int option_2 = diameterOfBinaryTree(root.left);
        int option_3 = diameterOfBinaryTree(root.right);

        return Math.max(option_1, Math.max(option_2, option_3));
    }

    private static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        printBinaryTree(root);
        System.out.println("---------------------------------");
//        System.out.println("Diameter of Tree is = " + diameterOfBinaryTree(root));
        System.out.println("Diameter of Tree is = " + diameterOfBinaryTreeOptimized(root));
    }
}
