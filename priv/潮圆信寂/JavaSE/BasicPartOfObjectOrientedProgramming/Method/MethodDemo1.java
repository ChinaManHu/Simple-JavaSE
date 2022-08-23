package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/6
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        PersonTwo personTwo = new PersonTwo();
        personTwo.speak();
        personTwo.cal01();
        personTwo.cal02();
        personTwo.getSum(66, 77);
    }
}

class PersonTwo {
    public void speak() {
        System.out.println("我是一个好人！！！");
    }
    public void cal01() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
    public void cal02() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("请输入一个数字：");
        number = scanner.nextInt();
        for (int i = 0; i <= number; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
    public void getSum(int number1, int number2)
    {
        int sum;
        sum = number1 + number2;
        System.out.println(sum);
    }
}
