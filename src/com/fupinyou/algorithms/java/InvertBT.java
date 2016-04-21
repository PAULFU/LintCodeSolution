/**翻转一颗二叉树
 * Created by fupinyou on 2016/4/21.
 */
public class InvertBT {
    private class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                     this.val = val;
                     this.left = this.right = null;
                 }
         }
    public void invertBinaryTree(TreeNode root){
        if (root==null) return;
       /* TreeNode temp=root;  //注意这么写错误的，并不能起到交换结点左右孩子的位置
        root.right=temp.left;  //实际上他们指向的是堆上的同一个对象
        root.left=temp.right;*/
        TreeNode temp=new TreeNode(root.val);
        temp.left=root.left;
        temp.right=root.right;
        root.right=temp.left;
        root.left=temp.right;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return;
    }
}
