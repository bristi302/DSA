class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp != null ){
               st.push(temp);
               temp = temp.left;
            }else{
                if(st.size() == 0) break;
                 TreeNode top = st.pop();
                 ans.add(top.val);
                 temp = top.right;
            }
        }
        return ans;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = inorderTraversal(root);
        return ans.get( k - 1);
    }
}