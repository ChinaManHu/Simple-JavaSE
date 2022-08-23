package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.TwoDimensionalArray;

/**
 * @author 潮圆信寂
 * @date 2022/8/4
 */
public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        int[][] arr = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("最终结果为：" + sum);
    }
}
