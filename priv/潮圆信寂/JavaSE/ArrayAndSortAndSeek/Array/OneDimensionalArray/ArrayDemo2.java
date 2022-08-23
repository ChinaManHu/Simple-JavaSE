package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/1
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //求出数组的最大值并得出它的下标
        int[] arr = {4 , -1 , 9 , 10 , 23, 22};
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                indexOfMax = i;
            }
        }
        System.out.println(max);
        System.out.println(indexOfMax);
    }
}
