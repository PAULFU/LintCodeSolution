/**
 * Created by fupinyou on 2016/4/25.
 */
public class BTMaxDepth {
    private class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private int depth=0;
    public int maxDepth(TreeNode root){
        if (root==null) return 0;
        if (root.left==null&&root.right==null) return 1;
        depth=Math.max(1+maxDepth(root.left),1+maxDepth(root.right));
        return depth;
    }
}
