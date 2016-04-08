/**
 * Created by fupinyou on 2016/4/8.
 */
public class SuperUglyNumber {
    public static int nthSuperUglyNumber(int n,int[] primers){
        int[] times=new int[primers.length];
        int[] uglynumbers=new int[n];
        uglynumbers[0]=1;
        for(int i=1;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<primers.length;j++){
                min=Math.min(min,primers[j]*uglynumbers[times[j]]);
            }
            uglynumbers[i]=min;
        for(int j=0;j<times.length;j++){
            if(primers[j]*uglynumbers[times[j]]==min){
                times[j]++;
            }
        }
        }
        return uglynumbers[n-1];
    }
    public static void main(String[] args){
        int[] primers={2,7,13,19};
        int n=6;
        System.out.println(nthSuperUglyNumber(n,primers));
    }
}
