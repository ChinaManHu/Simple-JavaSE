package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/2
 */
public class ArrayFlipDetail {
    public static void main(String[] args) {
        //将数组的元素内容翻转
        //arr{11,22,33,44,55,66}->arr{66,55,44,33,22,11}
        int[] arr1 = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = arr1[i];
        }
        System.out.print("arr1[]翻转后的值为：");
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = arr2[(arr1.length-1) - i];
            System.out.print(arr1[i] + "\t");
        }
        /*for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = arr1[(arr1.length-1) - i];
            System.out.print(arr1[i] + "\t");
        }因为在数组翻转的过程中，jvm内存中的堆中数组的原来的值是会被翻转时的赋值覆盖的，所以需要创建一个新的数组，且这个数组的值不受之前数组值改变的影响
        所以要将：arr1[i] = arr1[(arr1.length-1) - i];
        改变为：arr1[i] = arr2[(arr1.length-1) - i];
         */
        //除了这种方法外，也可以在翻转中创建一个新的变量去暂时存储即将被覆盖的值，详见ArrayFlipDemo2
    }
}
