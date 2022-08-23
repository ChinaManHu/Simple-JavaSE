package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/1
 */
public class ArrayDynamicInitializationTest {
    public static void main(String[] args) {
        //数组动态初始化
        System.out.print("请输入学生的个数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double[] score = new double[number];
        for (int i = 0; i < score.length; i++)
        {
            System.out.print("请输入第" + (i+1) + "学生的成绩：");
            double scannerScore = scanner.nextDouble();
            score[i] = scannerScore;
        }
        System.out.println("学生们的成绩为：");
        for (int i = 0; i < score.length; i++)
        {
            System.out.print(score[i] + "\t");
        }
    }
}
