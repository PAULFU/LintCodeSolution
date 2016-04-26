/**求给定数组的最大连续子数组，
 * 最大子数组就是和最大的连续子数组
 * Created by fupinyou on 2016/4/26.
 */
public class MaximumSubarray {

    public int maximumSubarray(int[] nums){
        if (nums==null || nums.length==0) return 0;
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            sum=Math.max(sum,0);
        }
        return max;
    }
}
