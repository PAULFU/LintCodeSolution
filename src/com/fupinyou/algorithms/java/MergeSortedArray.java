/**
 * 将数组B按顺序合并到数组A，假设数组A
 * 有足够的空间可以存放数组B的所有元素
 * Created by fupinyou on 2016/5/4.
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] A,int m,int[] B,int n){
        if (A == null && B == null) return;
        if (A == null){
            A=B;
            return;
        }
        if (B == null) return;
        int i=0,j=0,k=0;
        int[] C=new int[A.length];
        while (i<m && j<n){
            if(A[i]<B[j]){
                C[k]=A[i];
                i++;
            }
            else{
                C[k]=B[j];
                j++;
            }
            k++;
        }
        if(i<m){
            for(int p=i;p<m;p++){
                C[k]=A[p];
                k++;
            }
        }
        if (j<n){
            for (int q=j;q<n;q++){
                C[k]=B[q];
                k++;
            }
        }
        System.arraycopy(C, 0, A, 0, A.length);
    }
}
