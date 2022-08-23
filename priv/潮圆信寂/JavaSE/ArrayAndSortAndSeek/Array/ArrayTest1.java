package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/5
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //已知一个升序得数组，要求插入一个数后，该数组任然为升序
        int[] arr = {10, 12, 45, 90};
        int[] newArr = new int[arr.length + 1];
        int number;
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要插入的数字：");
        number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = number;
        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - 1 - i; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }
        for (int  i = 0; i < newArr.length; i++)
        {
            System.out.print(newArr[i] + "\t");
        }
    }
}
