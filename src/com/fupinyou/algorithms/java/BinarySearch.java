/**
 * 查找给定元素在数组中第一次出现的下标，
 * 说明数组元素可能会有重复
 * Created by fupinyou on 2016/4/17.
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start=0,stop=nums.length;
        int index=(start+stop)/2;
        while (nums[index]!=target){
            if (nums[index]>target){
                stop=index-1;
                index=(start+stop)/2;
            }
            else{
                start=index+1;
                index=(start+stop)/2;
            }

            if(start==stop&&nums[index]!=target) return -1;
        }
        if(index!=0){
            while (index!=0 && nums[index]==target){
                index--;
            }
            return index+1;
        }
        else
            return index;
    }
}
