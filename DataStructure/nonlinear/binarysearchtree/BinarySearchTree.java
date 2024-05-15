package DataStructure.nonlinear.binarysearchtree;

public class BinarySearchTree {
    TreeNode root;
    int count = 0;

    public TreeNode insert(int[] datas){
        for (int data: datas){
            root = insert(root, data);
            count++;
        }

        return root;
    }

    public TreeNode insert(TreeNode root, int data){
        if (root==null){
            root = new TreeNode(data);
        }
        else if (data< root.data){
            root.left = insert(root.left, data);
        }
        else if (data> root.data){
            root.right = insert(root.right, data);
        }
        return root;
    }

    public TreeNode delete(TreeNode root, int key){
        if (root==null) return null;
        else if (key< root.data) root.left = delete(root.left, key);
        else if (key> root.data) root.right = delete(root.right, key);
        else {
            if (root.left == null ) return root.right;
            else if (root.right == null) return root.left;
            else {
                root.data = minVal(root.right);
                root.right = delete(root.right, key);
            }
        }
        return root;
    }

    private int minVal(TreeNode root) {
        int min_val = root.data;
        while (root.left != null){
            min_val = root.left.data;
            root = root.left;
        }
        return min_val;
    }

    public int size(){
        return count;
    }

    public void preOrder(TreeNode root){
        if (root==null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if (root == null) return;

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data + " ");
    }
}
