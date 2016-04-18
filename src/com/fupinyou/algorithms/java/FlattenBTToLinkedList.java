import java.util.ArrayList;

/**
 * 将一颗二叉树压缩成一个链表，
 * 即所有节点只有右孩子
 * Created by fupinyou on 2016/4/18.
 */
public class FlattenBTToLinkedList {
    public class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                     this.val = val;
                     this.left = this.right = null;
                 }
         }
    public void flatten(TreeNode root) {
        // write your code here
        if(root==null) return;
        ArrayList<Integer> rst=preorderTraversal(root);
        TreeNode tn=root;
        for(int i=1;i<rst.size();i++){
            tn.left=null;
            tn.right=new TreeNode(rst.get(i));
            tn=tn.right;
        }
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> arra=new ArrayList<>();
        if(root==null){
            return arra;
        }
        arra.add(root.val);
        if (root.left!=null) {
            ArrayList<Integer> ali=preorderTraversal(root.left);
            if(ali!=null) {
                arra.addAll(ali);
            }
        }

        if(root.right!=null){
            ArrayList<Integer> ali=preorderTraversal(root.right);
            if(ali!=null) {
                arra.addAll(ali);
            }
        }
        return arra;
    }
}
