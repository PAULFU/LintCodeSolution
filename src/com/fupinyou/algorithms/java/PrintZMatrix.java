/**
 * 给定一个二维数组，按照“Z”字型打印出来
 * Created by fupinyou on 2016/4/24.
 */
public class PrintZMatrix {
    public static int[] printZMatrix(int[][] matrix) {
        // write your code here
        int column=matrix.length;
        int rank=matrix[0].length;
        int i=0,j=0,k=0;
        boolean bool1=true;
        boolean bool2=true;
        boolean bool3=true;//标记左边界
        boolean bool4=true;//标记右边界
        int[] result=new int[column*rank];
        if(column==1) return matrix[0];
        if(rank==1){
            for(int p=0;p<column;p++){
                result[p]=matrix[p][0];
            }
            return result;
        }
        result[k]=matrix[0][0];
        for (int m=1;m<result.length;m++){
             if (i!=rank-1&j==0& bool1){//上边界向右移动
                i++;
                //k++;
                result[m]=matrix[j][i];
                bool1=false;
                bool2=true;
                System.out.println(result[m]+"上边界向右移动");
            }
            else if (j==0& !bool1&bool2){//上边界向左下移动
                j++;
                i--;
                //k++;
                result[m]=matrix[j][i];
                bool1=true;
                System.out.println(result[m]+"上边界向左下移动");
            }
            else if (j!=column-1&i==0&j!=0&bool3){//左边界向下移动
                j++;
                //k++;
                result[m]=matrix[j][i];
                bool3=false;
                System.out.println(result[m]+"左边界向下移动");
            }
            else if(i==0&j!=0&!bool3){//左边界向右上移动
                j--;
                i++;
                //k++;
                result[m]=matrix[j][i];
                bool2=false;
                System.out.println(result[m]+"左边界向右上移动");
            }
            else if (i!=rank-1&j!=column-1&!bool2){//内部向右上移动
                j--;
                i++;
                bool4=true;
                //k++;
                result[m]=matrix[j][i];
                System.out.println(result[m]+"内部向右上移动");
            }
            else if (j!=column-1&bool2){//内部向左下移动
                i--;
                j++;
                bool3=true;
                //k++;
                result[m]=matrix[j][i];
                System.out.println(result[m]+"内部向左下移动");
            }
            else if (j==column-1&i!=rank-1&bool1){//下边界向右移动
                i++;
                //k++;
                result[m]=matrix[j][i];
                bool1=false;
                bool2=false;
                System.out.println(result[m]+"下边界向右移动");
            }
            else if(j==column-1&i!=rank-1&!bool1){//下边界向右上移动
                j--;
                i++;
                //k++;
                result[m]=matrix[j][i];
                System.out.println(result[m]+"下边界向右上移动");
            }
            else if (i==rank-1&j!=column-1&bool4){//右边界向下移动
                j++;
                bool4=false;
                bool2=true;
                bool1=true;
                //k++;
                result[m]=matrix[j][i];
                System.out.println(result[m]+"右边界向下移动");
            }
            else{
                result[m]=matrix[column-1][rank-1];
                 System.out.println(result[m]+"最后的元素");
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr={
        {1,2,3,4,5,6,7,8,9,10,11,12,13,14},
        {1,2,3,4,5,6,7,8,9,10,11,12,13,15},
        {1,2,3,4,5,6,7,8,9,10,11,12,14,15},
        {1,2,3,4,5,6,7,8,9,10,11,13,14,15},
        {1,2,3,4,5,6,7,8,9,10,12,13,14,15},
        {1,2,3,4,5,6,7,8,9,11,12,13,14,15},
        {1,2,3,4,5,6,7,8,10,11,12,13,14,15},
        {1,2,3,4,5,6,7,9,10,11,12,13,14,15},
        {1,2,3,4,5,6,8,9,10,11,12,13,14,15},
        {1,2,3,4,5,7,8,9,10,11,12,13,14,15},
        {1,2,3,4,6,7,8,9,10,11,12,13,14,15},
        {1,2,3,5,6,7,8,9,10,11,12,13,14,15},
        {1,2,4,5,6,7,8,9,10,11,12,13,14,15},
        {1,3,4,5,6,7,8,9,10,11,12,13,14,15},
        {2,3,4,5,6,7,8,9,10,11,12,13,14,15}
        };
        int[] rst=printZMatrix(arr);
        /*for (int i:rst){
            System.out.println(i);
        }*/
    }
}
