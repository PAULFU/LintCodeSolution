/**
 * Created by fupinyou on 2016/4/8.
 */
public class APlusB {
    public static int aplusb(int a,int b){
        while (b!=0){
            int a1=a^b;
            int b1=(a&b)<<1;
            a=a1;
            b=b1;
        }
        return a;
    }
    public static void main(String[] args){
        System.out.println(aplusb(12,20));
    }
}
