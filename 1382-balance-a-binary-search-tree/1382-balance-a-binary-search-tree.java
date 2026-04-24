class Solution {
     private void inorder(TreeNode root ,  List<Integer> ans ){
        if(root == null) return;
        inorder(root.left , ans);
        ans.add(root.val);
        inorder(root.right , ans);
    }
     public TreeNode helper(List<Integer> arr , int lo, int hi){
        if(lo>hi) return null;
        int mid = (lo+ hi)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left= helper(arr,lo,mid-1);
        root.right= helper(arr,mid+1, hi);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        int n = ans.size();
        return helper(ans , 0 , n-1);
    }
}