/**
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
