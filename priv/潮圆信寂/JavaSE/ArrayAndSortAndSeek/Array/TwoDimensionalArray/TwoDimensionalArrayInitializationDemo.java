package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.TwoDimensionalArray;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/4
 */
public class TwoDimensionalArrayInitializationDemo {
    public static void main(String[] args) {
        //简单的二维数组静态初始化
        int[][] arr = {{1, 1, 2},{1, 2, 3},{2, 3, 3}};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
