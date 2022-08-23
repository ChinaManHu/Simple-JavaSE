package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/23
 */
import java.util.Scanner;

public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int number_1 = 99;
        int number_2 = 110;
        int number_4 = 99;
        int number_5 = 110;
        //由于number_1>number_2为false,所以返回值为number_2--
        //number_1++在此处不执行
        int number_3 = number_1 > number_2 ? number_1++ : number_2--;
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        System.out.println();

        //由于number_4<number_5为true,所以返回值为number_4++
        //number_5--在此处不执行
        int number_6 = number_4 < number_5 ? number_4++ : number_5--;
        System.out.println(number_4);
        System.out.println(number_5);
        System.out.println(number_6);
        System.out.println();

        //实现三个数的最大值
        Scanner scanner = new Scanner(System.in);
        int number_7 = scanner.nextInt();
        int number_8 = scanner.nextInt();
        int number_9 = scanner.nextInt();
        int number_max;
        number_max = number_7 > number_8 ? number_7 : number_8;
        number_max = number_max > number_9 ? number_max : number_9;
        System.out.println("三个数中的最大值为："+number_max);
    }
}
