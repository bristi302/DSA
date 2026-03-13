class Solution {
    public boolean SameTree(TreeNode p, TreeNode q) {
        if(p== null && q== null) return true;
        if(p== null && q != null) return false;
        if(p != null && q== null) return false;
        if(p.val != q.val) return false;
        if(!SameTree(p.left , q.left)) return false;
        if(!SameTree(p.right, q.right)) return false;
        return true;
    }
    public void swap(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp ;
        swap(root.left);
        swap(root.right);
    }
    public boolean isSymmetric(TreeNode root) {
        swap(root.right);
        return SameTree(root.right , root.left);
    }
}