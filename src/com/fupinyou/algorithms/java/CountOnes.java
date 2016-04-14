/**
 * 二进制中有多少个1，比如8的二进制数是1000，
 * 有1个1。
 * Created by fupinyou on 2016/4/14.
 */
public class CountOnes {
    public static int countOnes(int num){
        int count=0;
        while (num!=0){
            num=num&(num-1);
            count++;
        }
        return count;
    }

    public static void main (String[] args){
        System.out.println(countOnes(8));
    }
}
