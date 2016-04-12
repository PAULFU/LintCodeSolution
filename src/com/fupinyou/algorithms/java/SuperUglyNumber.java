/**
 * Write a program to find the nth super ugly number.
 *Super ugly numbers are positive numbers
 *whose all prime factors are in the given prime list primes
 *of size k. For example, [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32]
 *is the sequence of the first 12 super ugly
 *numbers given primes = [2, 7, 13, 19] of size 4.
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
