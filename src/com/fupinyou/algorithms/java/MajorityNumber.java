import java.util.ArrayList;

/**
 * 给定一个整型数组，找出主元素，
 * 它在数组中的出现次数严格大于
 * 数组元素个数的二分之一。
 * Created by fupinyou on 2016/4/24.
 */
public class MajorityNumber {
    public int majorityNumber(ArrayList<Integer> nums) {
        int size=1;
        Integer integer=nums.get(0);
       for (int i=1;i<nums.size();i++){
           if (size==0){
               integer=nums.get(i);
           }
           if (integer==nums.get(i)){
               size++;
           }
           else {
               size--;
           }
       }
        return integer;
    }
}
