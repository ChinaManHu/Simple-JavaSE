package priv.潮圆信寂.JavaSE.BasicPart.Method.Recursion;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/8
 */
public class Fibonacci {
    public static void main(String[] args) {
        //输入数值，计算对应的斐波那契数
        int number;
        int numberOfFibonacci;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        number = scanner.nextInt();
        PrintFibonacci printFibonacci = new PrintFibonacci();
        numberOfFibonacci = printFibonacci.methodOfFibonacci(number);
        System.out.print("\n斐波那契数为：" + numberOfFibonacci);
    }
}

class PrintFibonacci {
    public int methodOfFibonacci(int number) {
        if (number == 1 || number == 2)
        {
            number = 1;
        }
        else
        {
            number = methodOfFibonacci(number - 1) + methodOfFibonacci(number - 2);
        }
        return number;
    }
}