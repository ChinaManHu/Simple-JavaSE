package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/14
 */
public class Test02 {
    public static void main(String[] args) {
        //定义方法find,实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数组元素个数：");
        int numberOfArray = scanner.nextInt();
        int[] arr = new int[numberOfArray];
        int element;
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("请输入第" + (i + 1) + "个元素:");
            element = scanner.nextInt();
            arr[i] = element;
        }
        FindArrayElement findArrayElement = new FindArrayElement();
        int realElement;
        System.out.print("请输入您想要查找的元素：");
        realElement = scanner.nextInt();
        int index = findArrayElement.findArrayElement(realElement, arr);
        if (index == -1)
        {
            System.out.print("数组中无此元素！！！");
        }
        else
        {
            System.out.print("您查找的元素在第" + (index + 1) + "位!!!");
        }
    }
}

class FindArrayElement {
    public int findArrayElement(int num,int[] arr)
    {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == num)
            {
                index = i;
            }
        }
        return index;
    }
}
