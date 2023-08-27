/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private void helpS(TreeNode root, StringBuilder res) {
        if (root == null) {
            res.append("null,");
        } else {
            res.append(root.val).append(",");
            helpS(root.left, res);
            helpS(root.right, res);
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helpS(root, sb);
        return sb.toString();
    }


   private TreeNode helpD(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("null")) {
            return null;
        }
        TreeNode tn = new TreeNode(Integer.parseInt(val));
        tn.left = helpD(queue);
        tn.right = helpD(queue);
        return tn;
}

    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helpD(queue);
    }


}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));