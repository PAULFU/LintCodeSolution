import java.util.ArrayList;

/**
 * 后序遍历二叉树
 * Created by fupinyou on 2016/4/12.
 */
public class BTPostorderTraversal {
    private static class TreeNode{
        public int val;
        public TreeNode left,right;
        public TreeNode(int val){
            this.val=val;
            this.left=this.right=null;
        }
    }
    private static ArrayList<Integer> rst;
    public static ArrayList<Integer> postorderTraversal(TreeNode root){
        ArrayList<Integer> arra=new ArrayList<>();
        if(root==null){
            return arra;
        }
        if (root.left!=null) {
            ArrayList<Integer> ali=postorderTraversal(root.left);
            if(ali!=null) {
                arra.addAll(ali);
            }
        }

        if(root.right!=null){
            ArrayList<Integer> ali=postorderTraversal(root.right);
            if(ali!=null) {
                arra.addAll(ali);
            }
        }
        arra.add(root.val);

        return arra;
    }
    public static void main(String[] args){
        TreeNode tn0=new TreeNode(11);
        TreeNode tn1=new TreeNode(22);
        TreeNode tn2=new TreeNode(33);
        TreeNode tn3=new TreeNode(44);
        TreeNode tn4=new TreeNode(55);
        tn0.left=tn1;
        tn1.left=tn2;
        tn1.right=tn3;
        tn0.right=tn4;
        rst=postorderTraversal(tn0);
        for (int i=0;i<rst.size();i++) {
            System.out.println(rst.get(i));
        }
    }
}
