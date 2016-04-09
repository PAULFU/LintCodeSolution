/**
 * Created by fupinyou on 2016/4/8.
 */
public class AddBinary {
    public static String addbinary(String a,String b){
        if(a.length()<b.length()){
            String tmp=a;
            a=b;
            b=tmp;
        }

        int pa=a.length()-1;
        int pb=b.length()-1;
        int carries=0;
        String result="";
        char ch='0';
        while (pb>=0){
            int sum=(int)(a.charAt(pa)-'0')+(int)(b.charAt(pb)-'0')+carries;
            result=String.valueOf(sum%2)+result;
            carries=sum/2;
            pa--;
            pb--;
        }
        while (pa>=0){
            int sum=(int)(a.charAt(pa)-'0')+carries;
            result=String.valueOf(sum%2)+result;
            carries=sum/2;
            pa--;
        }
        if(carries==1){
            result="1"+result;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(addbinary("0","0"));
    }
}
