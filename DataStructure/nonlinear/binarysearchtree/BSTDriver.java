package DataStructure.nonlinear.binarysearchtree;

public class BSTDriver {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[]arr = {10,23,5,7,27,1};
        TreeNode root = bst.insert(arr);

//        System.out.println("Pre-Order Traversal: ");
//        bst.preOrder(root);
//        System.out.println("\nIn-Order Traversal: ");
//        bst.inOrder(root);
//        System.out.println("\nPost-Order Traversal: ");
//        bst.postOrder(root);
//
//        System.out.println("\nSize: " + bst.size());

        bst.inOrder(root);

       bst.delete(root,7);
        System.out.println();
        bst.inOrder(root);
    }
}
