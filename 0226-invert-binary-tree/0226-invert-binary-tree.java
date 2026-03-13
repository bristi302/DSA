class Solution {
    public void swap(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp ;
        swap(root.left);
        swap(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}