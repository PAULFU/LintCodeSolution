/**
  样例：
  leftpad("foo", 5)
 >> "  foo"

 leftpad("foobar", 6)
 >> "foobar"

 leftpad("1", 2, "0")
 >> "01"
 * Created by fupinyou on 2016/4/22.
 */
public class LeftPad {
    static public String leftPad(String originalStr, int size) {
        // Write your code here
        int k=originalStr.length();
        for(int i=0;i<size-k;i++){
            originalStr=" "+originalStr;
        }
        return originalStr;
    }

    static public String leftPad(String originalStr, int size, char padChar) {
        // Write your code here
        String str=String.valueOf(padChar);
        int k=originalStr.length();
        for(int i=0;i<size-k;i++){
            originalStr=str+originalStr;
        }
        return originalStr;
    }
}
