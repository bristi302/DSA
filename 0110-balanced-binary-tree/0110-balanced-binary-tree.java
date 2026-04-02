class Solution {
       public int level(TreeNode root){
        if(root == null) return 0;
        return 1 +Math.max(level(root.left), level(root.right));
    }

    public boolean isBalanced(TreeNode root) {
         if(root == null) return true;
        int diff = Math.abs(level(root.left) - level(root.right));
        if(diff >1) return false;
        boolean lst = isBalanced(root.left);
        if(lst == false) return false;
        boolean rst = isBalanced(root.right);
        if(rst == false) return false;
        return true;
    }
}