package com.fupinyou.algorithms;

public class Fibonacci {
	  /**
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
