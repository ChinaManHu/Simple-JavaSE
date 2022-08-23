package priv.潮圆信寂.JavaSE.ProgramControlStructure.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/31
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        判断一个整数属于哪个范围：
        1）大于0
        2）小于0
        3）等于0
         */
        System.out.println("输入数字判断其所在范围，是否退出判断以(yes/no)为准");
        Scanner scannerAnswer = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        String answer = "yes";
        double number;
        while(answer.equals("yes"))
        {
            System.out.print("请输入数字：");
            number = scannerNumber.nextDouble();
            if (number > 0)
            {
                System.out.println("该数字大于0!!!");
            }
            else if (number < 0)
            {
                System.out.println("该数字小于0!!!");
            }
            else
            {
                System.out.println("该数字等于0!!!");
            }
            System.out.print("是否继续输入数字判断范围？(yes/no):");
            answer = scannerAnswer.next();
        }
    }
}
