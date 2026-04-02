class Solution {
    static int maxdia;
    public int level(TreeNode root){
         if(root == null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        int dia = leftlevel + rightlevel;
        maxdia = Math.max(dia,maxdia);
        return 1 +Math.max(leftlevel , rightlevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
       maxdia =0 ;
       level(root);
       return maxdia;
    }
}