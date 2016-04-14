/**报数问题，以1开始，紧后数字是第一个
 * 数字的读法。报数指的是，按照其中的整数的顺序进行报数，然后得到下一个数。如下所示：
 *1, 11, 21, 1211, 111221, ...
 *1 读作 "one 1" -> 11.
 *11 读作 "two 1s" -> 21.
 *21 读作 "one 2, then one 1" -> 1211.
 *给定一个整数 n, 返回 第 n 个顺序。
 * Created by fupinyou on 2016/4/14.
 */
public class CountAndSay {
    public static String countAndSay(int n){
        if(n==1) {
            return "1";
        }
        if(n==2){
            return "11";
        }
        String string=countAndSay(n-1);
        int length=string.length();
       char[] chars=string.toCharArray();
        int[] times=new int[2*length];
        char[] alpha=new char[length];
        times[0]=1;
        alpha[0]=chars[0];
        int sign=0;
        for(int i=0;i<length-1;i++){
            if(chars[i]==chars[i+1]){
                times[sign]++;
                alpha[sign]=chars[i];
            }
            else {
                sign++;
                times[sign]++;
                alpha[sign]=chars[i+1];
            }
        }
        int j=0;
        String result="";
        while (times[j]!=0){
                result=result+times[j]+String.valueOf(alpha[j]);
            j++;
        }
        return result;
    }
}
