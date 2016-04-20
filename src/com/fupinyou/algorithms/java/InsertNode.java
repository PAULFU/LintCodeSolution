/**
 * 在二叉查找树中的适当的位置插入给定的元素
 * Created by fupinyou on 2016/4/20.
 */
public class InsertNode {
    private class TreeNode {
        public int val;
        public TreeNode left, right;
        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
    public TreeNode insertNode(TreeNode root,TreeNode node){
        if (root==null) return node;
        if (node.val==root.val) return root;
        if(node.val<root.val){
            TreeNode tn=insertNode(root.left,node);
            root.left=tn;
        }
        if (node.val>root.val){
            TreeNode tn=insertNode(root.right,node);
            root.right=tn;
        }
        return root;
    }
}
