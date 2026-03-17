
class Solution {
    private int level(TreeNode root) {
           if(root == null ) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }
    private void nTHLevel(TreeNode root , int level , int lvl, List<Integer> arr ){
        if(root == null) return ;
        if(level> lvl) return;
        if(level == lvl ) arr.add(root.val);
         nTHLevel(root.left , level +1 , lvl , arr);
         nTHLevel(root.right , level +1 , lvl, arr);
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl =level(root);
        for(int i =0; i<=lvl-1; i++){
            List<Integer> arr = new ArrayList<>();
               nTHLevel(root,0, i , arr);
               ans.add(arr);
        }
        return ans;
    }
}