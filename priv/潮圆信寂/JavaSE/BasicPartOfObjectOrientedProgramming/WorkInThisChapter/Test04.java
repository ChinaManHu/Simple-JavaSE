package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.WorkInThisChapter;

import java.util.Scanner;

/**
 * @author 潮圆信寂
 * @date 2022/8/14
 */
public class Test04 {
    public static void main(String[] args) {
        //4.编写类A03,实现数组的复制功能copyArr,输入旧数组，返回一个新数组，元素和旧数组一样
        //5.定义一个圆类Circle,定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法
        //6.编程创建一个Cale计算类， 在其中定义2个变量表示两个操作数，定义四个方法
        // 实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
        int numberOfArrayElement;
        int element;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入旧数组元素个数：");
        numberOfArrayElement = scanner.nextInt();
        int[] oldArray = new int[numberOfArrayElement];
        for (int i = 0; i < numberOfArrayElement; i++) {
            System.out.print("请输入元素：");
            element = scanner.nextInt();
            oldArray[i] = element;
        }
        CopyArrElement copyArrElement = new CopyArrElement();
        int[] newArray = copyArrElement.copyArr(oldArray);
        System.out.print("新数组为：");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
        System.out.print("旧数组为：");
        for (int i = 0; i < oldArray.length; i++) {
            System.out.print(oldArray[i] + "\t");
        }
        if (newArray.hashCode() == oldArray.hashCode()) {
            System.out.print("\n编写错误");
        }
    }
}

class CopyArrElement {
    public int[] copyArr(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
