import java.util.HashSet;

/**
 * 一个数是不是快乐是这么定义的：
 * 对于一个正整数，每一次将该数替换
 * 为他每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为1，
 * 或是无限循环但始终变不到1。
 * 如果可以变为1，那么这个数就是快乐数。
 * Created by fupinyou on 2016/4/18.
 */
public class HappyNumber {
    public static boolean isHappy(int n){
        char[] ch=String.valueOf(n).toCharArray();
        int m=0;
        HashSet<Integer> hashSet=new HashSet<>();
        while (n!=1){
            if (hashSet.contains(n)) return false;
            else
            hashSet.add(n);
            for (int i=0;i<ch.length;i++){
                m=m+(ch[i]-'0')*(ch[i]-'0');
            }
            ch=String.valueOf(m).toCharArray();
            n=m;
            m=0;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }
}
