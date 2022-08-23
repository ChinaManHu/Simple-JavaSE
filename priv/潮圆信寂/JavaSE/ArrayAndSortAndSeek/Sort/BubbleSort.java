package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Sort;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/3
 */
public class BubbleSort {
    public static void main(String[] args) {
        //冒泡排序法
        //相邻的两个数（i,i+1）比较，比较后再比较（i+1,i+2）以此类推，循环比较
        int[] arr = {1, 3, 5, 7, 9, 10, 8, 6, 4, 2};
        int i, j, temp;
        for (i = 0; i < arr.length - 1; i++)
        {
            for (j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++)
        {
            System.out.print(arr[k] + "\t");
        }
    }
}
