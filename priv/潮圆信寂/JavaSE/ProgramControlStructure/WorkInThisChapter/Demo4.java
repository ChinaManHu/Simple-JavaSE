package priv.潮圆信寂.JavaSE.ProgramControlStructure.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/1
 */
public class Demo4 {
    public static void main(String[] args) {
        /*
        判断一个三位数的整数是否为水仙花数
        水仙花数：个位，十位，百位的三次方相加等于这个三位数本身
         */
        System.out.print("请输入您想判断的数字：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfBits = number%100%10;
        int numberOfTen = number%100/10;
        int numberOfHundred = number/100;
        int sum = (int) (Math.pow(numberOfBits,3)+Math.pow(numberOfTen,3)+Math.pow(numberOfHundred,3));
        if (sum == number)
        {
            System.out.println("是水仙花数！");
        }
        else
        {
            System.out.println("不是水仙花数！！！");
        }
    }
}
