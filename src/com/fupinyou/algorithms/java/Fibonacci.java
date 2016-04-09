public class Fibonacci {
	  /**
       * 查找斐波纳契数列中第 N 个数。
       *所谓的斐波纳契数列是指：
       *前2个数是 0 和 1 。
       *第 i 个数是第 i-1 个数和第i-2 个数的和。
       *斐波纳契数列的前10个数字是：
       * *0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
       * @param n: an integer
       * @return an integer f(n)
       */
    public static int fibonacci(int n) {
        // write your code here
        int[] a=new int[100];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<100;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1];
    }
    public static void main(String[] args){
        int i=10;
        int j;
        j=fibonacci(i);
        System.out.println(j);
    }
}
