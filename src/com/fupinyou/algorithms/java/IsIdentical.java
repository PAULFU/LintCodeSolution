/**
 * 检查两棵二叉树是否等价。等价的意思是说，
 * 首先两棵二叉树必须拥有相同的结构，
 * 并且每个对应位置上的节点上的数都相等。
 * Created by fupinyou on 2016/4/20.
 */
public class IsIdentical {
     private class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                     this.val = val;
                     this.left = this.right = null;
                 }
         }
    public boolean isIdentical(TreeNode a,TreeNode b){
        if (a==null && b==null) return true;
        if(a==null | b==null) return false;
        if (a.val==b.val){
           return isIdentical(a.left,b.left) & isIdentical(a.right,b.right);
        }
        return false;
    }
}
