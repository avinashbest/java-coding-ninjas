package binaryTrees1;

import java.util.Scanner;

import static binaryTrees1.BinaryTreeInput.takeTreeInputDetailed;
import static binaryTrees1.BinaryTreeInput.printBinaryTree;
/*For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.
Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.

The second line of input contains an integer, denoting the value of X.
Note:
You are not required to print anything explicitly. It has already been taken care of.
Output Format:
The only line of output prints the total number of nodes where the node data is greater than X.
Constraints:
1 <= N <= 10^5
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
1 4 2 3 -1 -1 -1
2
Sample Output 1:
2
Explanation for Sample Input 1:
Out of the four nodes of the given binary tree, [3, 4] are the node data that are greater than X = 2.
Sample Input 2:
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
5
Sample Output 2:
3
*/

public class NodesGreaterThanX {

    public static int noOfNodesGreaterThanX(BinaryTreeNode<Integer> root, int X) {
        if (root == null) return 0;
//        if the root's data is greater than X we increment the counter, otherwise not
        int counter = (root.data > X) ? 1 : 0;

        if (root.left != null) counter += noOfNodesGreaterThanX(root.left, X);
        if (root.right != null) counter += noOfNodesGreaterThanX(root.right, X);

        return counter;
    }

    public static void main(String[] args) {
        var root = takeTreeInputDetailed(true, 0, true);
        System.out.println("----------The Tree is----------");
        printBinaryTree(root);
        System.out.println("-------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the X: ");
        int X = scan.nextInt();
        System.out.println("Number of Nodes which are greater than " + X + ": " + noOfNodesGreaterThanX(root, X));
    }
}
