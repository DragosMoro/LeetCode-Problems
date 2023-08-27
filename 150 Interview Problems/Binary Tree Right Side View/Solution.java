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
    List<Integer> lista = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {

        if(root == null)
        {
            return lista;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        lista.add(root.val);
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                if(node.left != null)
                {
                    q.offer(node.left);
                }
                if(node.right != null)
                {
                    q.offer(node.right);
                }
                if(i == size-1 && q.peek()!=null)
                {
                    lista.add(q.peek().val);
                }
            }
        }
        return lista;

    }

}