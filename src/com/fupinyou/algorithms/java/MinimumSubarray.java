import java.util.ArrayList;

/**求给定数组的最小连续子数组，
 * 最小子数组就是和最小的连续子数组
 * Created by fupinyou on 2016/4/26.
 */
public class MinimumSubarray {
    public int minimumSubarray(ArrayList<Integer> nums){
        int min=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums.get(i);
            min=Math.min(min,sum);
            sum=Math.min(sum,0);
        }
        return min;
    }
}
