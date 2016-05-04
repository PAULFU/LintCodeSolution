/**
 * Created by fupinyou on 2016/5/4.
 */
public class MergeSortedArrayII {
    public int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null && B == null) return null;
        if (A == null){
            return B;
        }
        if (B == null) return A;
        int i=0,j=0,k=0;
        int len_a=A.length;
        int len_b=B.length;
        int[] C=new int[len_a+len_b];
        while (i<len_a && j<len_b){
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
        if(i<len_a){
            for(int p=i;p<len_a;p++){
                C[k]=A[p];
                k++;
            }
        }
        if (j<len_b){
            for (int q=j;q<len_b;q++){
                C[k]=B[q];
                k++;
            }
        }
        return C;
    }
}
