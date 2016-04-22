import java.util.Stack;

/**
 * 给定一个整数数组（下标从 0 到 n-1，
 * n 表示整个数组的规模），请找出
 * 该数组中的最长上升连续子序列。
 * （最长上升连续子序列可以定义为从
 * 右到左或从左到右的序列。）
 * Created by fupinyou on 2016/4/22.
 */
public class LongestContinueSubsequence {
    public static int longestIncreasingContinuousSubsequence(int[] A){
        if (A==null) return 0;
        Stack<Integer> mStack=new Stack<>();
        int n=0;
        int c=1;
        for (int index=0;index<A.length;index++){
            if(mStack.size()==2){
                int b=mStack.pop();
                int a=mStack.pop();
                c=a-b;
                mStack.push(a);
                mStack.push(b);
            }
            if (mStack.isEmpty()||mStack.size()==1||(mStack.peek()-A[index])>>31==c>>31){
                mStack.push(A[index]);
            }
            else{
                n=n<mStack.size()?mStack.size():n;
                mStack.clear();
                mStack.push(A[index-1]);
                mStack.push(A[index]);
            }
        }
        n=n<mStack.size()?mStack.size():n;
        return n;
    }
    public static void main(String[] args){
        int[] B={5,4,2,1,3};
        int fs=longestIncreasingContinuousSubsequence(B);
        System.out.println(fs);
    }
}
