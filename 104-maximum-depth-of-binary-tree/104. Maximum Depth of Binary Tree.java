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
 class Pair {
    TreeNode first;
    int second;

    public Pair(TreeNode first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    // dfs cu recursivitate
    // public int maxDepth(TreeNode root) {
    //     if(root == null)
    //     {
    //         return 0;
    //     }
    //     else{
    //         return(1+ Math.max(maxDepth(root.left), maxDepth(root.right)));
    //     }
    // }

    // bfs
    // public int maxDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
        
    //     int level = 0;
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.add(root);

    //     while (!q.isEmpty()) {
    //         int size = q.size();
    //         for (int i = 0; i < size; i++) {
    //             TreeNode node = q.poll();
    //             if (node.left != null) {
    //                 q.add(node.left);
    //             }
    //             if (node.right != null) {
    //                 q.add(node.right);
    //             }
    //         }
    //         level++;
    //     }

    //     return level;
    // }

    // dfs iterativ
      public int maxDepth(TreeNode root) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        int res = 0;
        while(!st.empty())
        {
            Pair value = st.pop();
            if(value.first !=null)
            {
                res = Math.max(res, value.second);
                st.push(new Pair(value.first.left, value.second+1));
                st.push(new Pair(value.first.right, value.second+1));
            }
        }
        return res;

    }

}