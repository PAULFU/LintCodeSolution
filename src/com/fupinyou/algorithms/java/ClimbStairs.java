/**
 * 假设你正在爬楼梯，需要n步你才能到达顶部。
 * 但每次你只能爬一步或者两步，你能有多少种
 * 不同的方法爬到楼顶部？
 * Created by fupinyou on 2016/4/12.
 */
public class ClimbStairs {

    private static long an;
    public static long climbStairs(int n) {
        // write your code here
        if(n==0) return 1;
        int rst[]={1,2};
        if(n<3) return rst[n-1];

        long a1=1,a2=2;
        for(int i=3;i<=n;i++){
            an=a1+a2;
            a1=a2;
            a2=an;
        }
        return an;
    }
    public static void main(String[] args){
        System.out.println(climbStairs(5));
    }
}
