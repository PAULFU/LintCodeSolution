import java.util.ArrayList;

/**
 * Created by fupinyou on 2016/5/31.
 */
public class PermutationIndex {
    /**
     * @param A an integer array
     * @return a long integer
     */
    public static long permutationIndex(int[] A) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int size=A.length;
        long index;
        long result=1;
        for(int i=0;i<size;i++){
            arrayList.add(A[i]);
        }
        for(int j=0;j<size;j++){
            index=rank(arrayList,A[j]);
            result+=(index-1)*(factorial(size-j-1));
            arrayList.remove(0);
        }
        return result;
    }

    public static long rank(ArrayList<Integer> B,int k){
        int index=1;
        for(int i=0;i<B.size();i++){
            if(B.get(i)<k){
                index++;
            }
        }
        return index;
    }

    public static long factorial(int n){
        long count=1;
        while (n!=0){
            count*=n;
            n--;
        }
        return count;
    }

    public static void main(String[] args){
        int[] array={22,7,15,10,11,12,14,8,9,1,2,3,6,5,4};
        long l=permutationIndex(array);
        System.out.println(l);
    }
}
