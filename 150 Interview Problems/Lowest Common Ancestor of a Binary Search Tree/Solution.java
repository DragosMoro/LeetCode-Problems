
class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
        if(p.val < root.val && q.val < root.val)
        {
            root = root.left;
        }
        if(p.val > root.val && q.val > root.val)
        {
            root = root.right;
        }
        if(p.val == root.val || q.val == root.val)
        {
            return root;
        }
        if(p.val < root.val && q.val > root.val || p.val > root.val && q.val < root.val)
        {
            return root;
        }
        }
        return root;
    }
}