package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/2
 */
public class ArrayExpansionTest {
    public static void main(String[] args) {
        //实现数组的动态扩容，对数组进行扩容
        //用户可以通过输入决定是否继续添加元素
        int arr[] = {1, 2, 3};
        int[] arrNew = new int[arr.length + 1];
        int newElement;
        String strScanner = "yes";
        Scanner scanner = new Scanner(System.in);
        while (strScanner.equals("yes"))
        {
            System.out.print("请输入将添加的数组元素（数字）：");
            newElement = scanner.nextInt();
            for (int i = 0; i < arr.length; i++)
            {
                arrNew[i] = arr[i];
            }
            arrNew[arrNew.length-1] = newElement;
            arr = arrNew;
            System.out.print("是否继续输入元素(yes/no)：");
            strScanner = scanner.next();
            arrNew = new int[arr.length + 1];
        }
        System.out.println("添加后的数组为：");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print( arr[i] + "\t");
        }
    }
}
