import java.util.ArrayList;
import java.util.List;

/**
 * 找出二叉树的说有路径
 * Created by fupinyou on 2016/4/18.
 */
public class BinaryTreePaths {
    private class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                     this.val = val;
                     this.left = this.right = null;
                 }
         }
    public List<String> binaryTreePaths(TreeNode root){
        List<String> als= new ArrayList<>();
        if(root==null)
            return als;
        helper(root,String.valueOf(root.val),als);
        return als;
    }

    private void helper(TreeNode root,String path,List<String> als){
        if (root.left==null&&root.right==null){
            als.add(path);
            return;
        }
        if(root.left!=null){
            helper(root.left,path+"->"+String.valueOf(root.left.val),als);
        }
        if (root.right!=null){
            helper(root.right,path+"->"+String.valueOf(root.right.val),als);
        }
    }
}
