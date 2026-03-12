
class Solution {
    private void preorder(TreeNode root ,  List<Integer> ans ){
        if(root == null) return;
        preorder(root.left , ans);
        ans.add(root.val);
        preorder(root.right , ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
}