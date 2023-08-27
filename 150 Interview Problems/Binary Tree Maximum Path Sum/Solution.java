/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = root.val;
        dfs(root);
        return maxSum;


    }
    private int dfs(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);

        //aici calculam maximul deoarece nu dorim sa adaugam elemente negative
        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);

        //aici calculam posibilitatea in care subtree ul ramificat este mai mare decat maxSum
        maxSum = Math.max(maxSum, root.val+leftMax+rightMax);

        
        return root.val+Math.max(leftMax, rightMax);
    }
    

     
}
