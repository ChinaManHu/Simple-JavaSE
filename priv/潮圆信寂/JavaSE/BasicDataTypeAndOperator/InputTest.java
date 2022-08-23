package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/24
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        System.out.println("员工的姓名为：" + name + "\t年龄为：" + age + "\t薪水为：" + salary);
    }
}
