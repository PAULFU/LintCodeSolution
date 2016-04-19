/**
 * 在数据结构中，哈希函数是用来将一个字符串（或任何其他类型）转化为小于哈希表大小且大于等于零的整数。一个好的哈希函数可以尽可能少地产生冲突。一种广泛使用的哈希函数算法是使用数值33，假设任何字符串都是基于33的一个大整数，比如：
 *hashcode("abcd") = (ascii(a) * 333 + ascii(b) * 332 + ascii(c) *33 + ascii(d)) % HASH_SIZE
 *= (97* 333 + 98 * 332 + 99 * 33 +100) % HASH_SIZE
 *= 3595978 % HASH_SIZE
 *其中HASH_SIZE表示哈希表的大小(可以假设一个哈希表就是一个索引0 ~ HASH_SIZE-1的数组)。
 *给出一个字符串作为key和一个哈希表的大小，返回这个字符串的哈希值。
 *
 * 这道题主要就是要注意当字符数组比较大时会超出数据类型
 * 表示的范围
 * Created by fupinyou on 2016/4/19.
 */
public class HashFunction {
    public static int hashcode(char[] key,int HASH_SIZE){
       /* 测试“ubuntu”时，因为超出数据表示的范围，
          会返回错误的结果，因为系统自动帮你“窄化”处理了
       long hash=0;
        for(int i=0;i<key.length;i++){
            hash=(hash+(long) key[i]*(int)Math.pow(33,key.length-i-1))%HASH_SIZE;
            System.out.println(hash);
        }
        hash=hash%HASH_SIZE;
        return (int)hash;*/
        long ans = 0;
        for(int i = 0; i < key.length;i++) {
            ans = (ans * 33 + (int)(key[i])) % HASH_SIZE;
        }
        return (int)ans;
    }
    public static void main(String[] args){
        char[] ch="ubuntu".toCharArray();
        System.out.println( hashcode(ch,1007));
    }
}
