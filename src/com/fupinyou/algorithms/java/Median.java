/**给定一个未排序的整数数组，找到其中位数。
 *中位数是排序后数组的中间值，如果数组
 * 的个数是偶数个，则返回排序后数组的第N/2个数
 * Created by fupinyou on 2016/4/27.
 */
public class Median {
    public static int median(int[] nums){
        int size=nums.length;
        quickSort(nums);
        if (isEvenNumber(size)) return nums[size/2-1];
        return nums[size/2];
    }
    private static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    private static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[low];     //枢轴记录
        while (low<high){
            while (low<high && arr[high]>=pivot) --high;
            arr[low]=arr[high];             //交换比枢轴小的记录到左端
            while (low<high && arr[low]<=pivot) ++low;
            arr[high] = arr[low];           //交换比枢轴小的记录到右端
        }
        //扫描完成，枢轴到位
        arr[low] = pivot;
        //返回的是枢轴的位置
        return low;
    }

    private static boolean isEvenNumber(int n){
        return n % 2 == 0;
    }
    public static void main(String[] args){
        int[] arr={4,5,1,2,3};
        System.out.println(median(arr));
    }
}
