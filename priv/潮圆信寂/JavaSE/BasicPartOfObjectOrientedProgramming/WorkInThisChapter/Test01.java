package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/14
 */
public class Test01 {
    public static void main(String[] args) {
        //定义方法max，实现求某个double数组的最大值，并返回索引下标
        int numberOfArray;
        double arrayElement;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组元素个数：");
        numberOfArray = scanner.nextInt();
        double[] arr = new double[numberOfArray];
        for (int i = 0; i < numberOfArray; i++)
        {
            System.out.print("请输入第" + (i + 1) + "个double数组元素：");
            arrayElement = scanner.nextDouble();
            arr[i] = arrayElement;
        }
        ReturnMax returnMax = new ReturnMax();
        double maxValue = returnMax.max(arr);
        System.out.print("arr数组元素中最大值为：" + maxValue);
    }
}

class ReturnMax {
    public double max(double[] returnMax)
    {
        double max = 0;
        for (int i = 0; i < returnMax.length; i++)
        {
            if (returnMax[i] > max)
            {
                max = returnMax[i];
            }
        }
        return max;
    }
}