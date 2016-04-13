/**
 * 给一个排序数组（从小到大），将其转换为一棵高度最小的排序二叉树。
 * Created by fupinyou on 2016/4/13.
 */
public class SortArrayToBST {
    private static class TreeNode {
         public int val;
         public TreeNode left, right;
         public TreeNode(int val) {
             this.val = val;
             this.left = this.right = null;
                }
         }
    public static TreeNode toBST(int[] A){
        int k=A.length;
        if (k==0) return null;
        if(k==1){
            TreeNode treeNode=new TreeNode(A[0]);
            return treeNode;
        }
        if(k==2){
            TreeNode treeNode0=new TreeNode(A[0]);
            TreeNode treeNode1=new TreeNode(A[1]);
            treeNode0.right=treeNode1;
            return treeNode0;
        }

        int center;
        if(k%2==0) center=k/2-1;
        else center=k/2;
//        int left=center/2;
//        int right=(center+k)/2;
        int[] B1=new int[center];
        int[] B2=new int[k-center-1];
        for(int i=0;i<center;i++){
            B1[i]=A[i];
        }
        for(int j=center+1;j<k;j++){
            B2[j-center-1]=A[j];
        }

        TreeNode treeNodeFather=new TreeNode(A[center]);
        TreeNode treeNodeLeft=toBST(B1);
        TreeNode treeNodeRight=toBST(B2);
        treeNodeFather.left=treeNodeLeft;
        treeNodeFather.right=treeNodeRight;

        return treeNodeFather;
    }
}
