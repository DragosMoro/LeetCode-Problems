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

 //My Approach


// class Solution {
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         if(preorder.length == 0 || inorder.length == 0)
//         {
//             return null;
//         }
//         TreeNode root = new TreeNode(preorder[0]);
//         int rootPos=0;
//         for(int i=0;i<inorder.length;i++)
//         {
//             if(inorder[i] == root.val)
//             {
//                 rootPos = i;
//                 break;
//             }
//         }
//         root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootPos+1), Arrays.copyOfRange(inorder, 0, rootPos));
//         root.right = buildTree(Arrays.copyOfRange(preorder,rootPos+1, preorder.length),  Arrays.copyOfRange(inorder,rootPos+1, inorder.length));

//         return root;
        
        
//     }
// }
class Solution {

    Map<Integer, Integer> inorderPositions = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderPositions.put(inorder[i], i);
        }

        return builder(preorder, 0, 0, inorder.length - 1);
    }

    public TreeNode builder(
        int[] preorder,
        int preorderIndex,
        int inorderLow,
        int inorderHigh
    ) {
        if (
            preorderIndex > preorder.length - 1 || inorderLow > inorderHigh
        ) return null;

        int currentVal = preorder[preorderIndex];
        TreeNode n = new TreeNode(currentVal);
        int mid = inorderPositions.get(currentVal);

        n.left = builder(preorder, preorderIndex + 1, inorderLow, mid - 1);
        n.right =
            builder(
                preorder,
                preorderIndex + (mid - inorderLow) + 1,
                mid + 1,
                inorderHigh
            );

        return n;
    }
}