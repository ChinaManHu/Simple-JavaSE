package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/2
 */
public class ArrayFlipDemo {
    public static void main(String[] args) {
        //创建一个中间变量去暂时存储将被覆盖的值，以此完成数组翻转
        int[] arr = {11, 22, 33, 44, 55, 66};
        for (int i = 0; i < arr.length/2; i++)
        {
            int tmep = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = tmep;
        }
        System.out.print("翻转后的数组：");
        for (int  i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }
}
