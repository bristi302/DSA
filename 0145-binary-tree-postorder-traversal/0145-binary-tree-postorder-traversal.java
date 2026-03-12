
class Solution {
    private void preorder(TreeNode root ,  List<Integer> ans ){
        if(root == null) return;
        preorder(root.left , ans);
        preorder(root.right , ans);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }
}