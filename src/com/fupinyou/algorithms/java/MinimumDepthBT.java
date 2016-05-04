/**
 * 给定一个二叉树，找出其最小深度。
 *二叉树的最小深度为根节点到最近叶子节点的距离。
 * Created by fupinyou on 2016/5/4.
 */
public class MinimumDepthBT {
    private class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                     this.val = val;
                     this.left = this.right = null;
                 }
         }
    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null && root.right==null) return 1;
        if (root.left==null) {
            return 1+minDepth(root.right);
        }
        if (root.right==null){
            return 1+minDepth(root.left);
        }
        int depth_left;
        int depth_right;
        depth_left=1+minDepth(root.left);
        depth_right=1+minDepth(root.right);
        return Math.min(depth_left,depth_right);
    }
}
