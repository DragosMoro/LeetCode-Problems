import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> fList = new ArrayList<>();
        if(root==null)
        {
            return fList;
        }
        List<Integer> rootList = new ArrayList<>();
        rootList.add(root.val);
        fList.add(rootList);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> elems = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                if(node.left !=null)
                {
                    q.add(node.left);
                    elems.add(node.left.val);
                }
                if(node.right !=null)
                {
                    q.add(node.right);
                    elems.add(node.right.val);
                }
            }
            if(!elems.isEmpty())
            {
                fList.add(elems);
            }
            
        }
        
        return fList;

    }
}