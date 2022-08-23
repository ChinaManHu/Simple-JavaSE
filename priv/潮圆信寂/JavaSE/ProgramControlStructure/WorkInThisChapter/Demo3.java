package priv.潮圆信寂.JavaSE.ProgramControlStructure.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/1
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        判断一个年份是否为闰年
         */
        System.out.print("请输入您想要判断的年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0)
        {
            System.out.println("是闰年！");
        }
        else
        {
            System.out.println("不是闰年！！！");
        }
    }
}
