import java.util.ArrayList;

/**
 * 查找词典中的最长的单词
 * Created by fupinyou on 2016/4/24.
 */
public class LongestWords {
    public ArrayList<String> longestWords(String[] dictionary){
        int len=0;
        for (String s:dictionary){
            len=Math.max(len,s.length());
        }
        ArrayList<String> als=new ArrayList<>();
        for (String s:dictionary){
            if (s.length()==len){
                als.add(s);
            }
        }
        return als;
    }
}
