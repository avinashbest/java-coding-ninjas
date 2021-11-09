package binarySearchTree2;

public class BinarySearchTreeUse {
    public static void main(String[] args) {
        var bst = new BinarySearchTree<Integer>();

        bst.insert(5);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);
        bst.insert(8);

        bst.printTree();

        System.out.println(bst.isPresent(5));
        bst.deleteData(5);
        System.out.println(bst.isPresent(5));

        bst.printTree();
    }
}
