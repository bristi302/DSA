class Solution {
    static boolean ans;
    public int level(TreeNode root){
        if(root == null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        int diff = Math.abs(leftlevel - rightlevel);
        if(diff > 1) ans = false;
        return 1 +Math.max(leftlevel , rightlevel);
    }

    public boolean isBalanced(TreeNode root) {
        ans = true;
        level(root);
        return ans;
    }
}