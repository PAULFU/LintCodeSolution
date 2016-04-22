/**
 * 返回给定字符串的最后一个单词的长度
 * Created by fupinyou on 2016/4/22.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.indexOf(" ")==-1) return s.length();
        String[] strarray=s.split(" ");
        return strarray[strarray.length-1].length();
    }
}
