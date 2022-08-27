package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.SmallChangeSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/25
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        //简单的零钱通系统
        //面向过程编程
        boolean loop = true;
        double income;
        double balance = 0;
        double expense;
        String confirmationPrompt;
        String sourceOfIncome;
        String consumptionDescription;
        String balancePrompt;
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH-dd HH:mm");
        String detail = "----------零钱通明细----------";
        do {
            System.out.println("----------零钱通菜单----------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.print("请输入您的选择（1~4）：");
            String answer = scanner.next();
            balancePrompt = "您的现有余额为：" + balance;
            switch (answer) {
                case "1":
                    System.out.println( "\n" + detail + "\n");
                    break;
                case "2":
                    System.out.println("收益入账");
                    System.out.print("请说明本次收益来源：");
                    sourceOfIncome = scanner.next();
                    System.out.print("请输入本次收益：");
                    income = scanner.nextDouble();
                    if (income >= 0)
                    {
                        balance += income;
                    }
                    else
                    {
                        income = 0;
                        System.out.println("您输入的收益金额有误！");
                        break;
                    }
                    detail += "\n收益入账\t" + sourceOfIncome + "\t+" + income + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("消   费");
                    System.out.print("请说明本次消费内容：");
                    consumptionDescription = scanner.next();
                    System.out.print("请输入本次消费金额（" + balancePrompt + "）：");
                    expense = scanner.nextDouble();
                    if (expense >= 0 && expense <= balance)
                    {
                        balance -= expense;
                    }
                    else
                    {
                        expense = 0;
                        System.out.println("您输入的消费金额有误！");
                        break;
                    }
                    detail += "\n消   费\t" + consumptionDescription + "\t-" + expense + "\t" + sdf.format(date) + "\t余额：" + balance;
                    break;
                case "4":
                    System.out.println("您确定要退出吗？(yes/no)：");
                    confirmationPrompt = scanner.next();
                    if ("yes".equals(confirmationPrompt))
                    {
                        loop = false;
                        System.out.println("欢迎下次使用！！！");
                        System.out.println("正在退出程序！");
                    }
                    else if ("no".equals(confirmationPrompt))
                    {
                        System.out.println("请继续使用！");
                        continue;
                    }
                    else
                    {
                        System.out.println("您的输入有误！！！");
                    }
                    break;
                default:
                    System.out.println("您的输入有误！请重新输入！！！");
            }
        }while (loop);
    }
}

