/**
 * Created by fupinyou on 2016/4/8.
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
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
