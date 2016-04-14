/**
 * Given two vectors A and B with the same size, calculate the cosine similarity.
 *Return 2.0000 if cosine similarity is invalid (for example A = [0] and B = [0]).
 * Created by fupinyou on 2016/4/14.
 */
public class CosineSimilarity {
    public static double cosineSimilarity(int[] A,int[] B){
        int beyond=0;
        double Alength=0.0,Blength=0.0;
        for(int i=0;i<A.length;i++){
            beyond+=A[i]*B[i];
            Alength+=Math.pow(A[i],2);
            Blength+=Math.pow(B[i],2);
        }
        double below=Math.sqrt(Alength)*Math.sqrt(Blength);
        if(below==0) return 2.0;
        double result=(double) beyond/below;
        return result;
    }
}
