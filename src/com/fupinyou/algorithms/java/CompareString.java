/**
 * 判断字符串B是否包含在A中，不要求有序和连续
 * 字符串A和B中的字符都是大写字母
 * 给出 A = "ABCD" B = "ACD"，返回 true
 给出 A = "ABCD" B = "AABC"， 返回 false
 * Created by fupinyou on 2016/4/13.
 */
public class CompareString {
    public static boolean compareString(String A,String B){
        //A=A.toUpperCase();若A，B不一定都是大写，且比较时忽略大小写，则只需加上这两行代码
        //B=B.toUpperCase();
        int count[]=new int[26];
        for(int i=0;i<26;i++){
            count[i]=0;
        }

        for (int i=0;i<A.length();i++){
            count[A.charAt(i)-'A']++;
        }
        for(int i=0;i<B.length();i++){
            count[B.charAt(i)-'A']--;
            if (count[B.charAt(i)-'A']<0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(compareString("ABCD","CD"));
    }
}
