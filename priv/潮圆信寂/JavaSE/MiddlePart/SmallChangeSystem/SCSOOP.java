package priv.潮圆信寂.JavaSE.MiddlePart.SmallChangeSystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/28
 */
public class SCSOOP {
    boolean loop = true;
    double balance = 0;
    double income;
    double consume;
    String sourceOfIncome;
    String consumptionDescription;
    String details = "";
    String confirm;
    Scanner scanner = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm");
    int choice;

    public void menu() {
        do {
            System.out.println("\n----------零钱通菜单----------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.print("请输入您的选择（1~4）：");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    this.detail();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.consume();
                    break;
                case 4:
                    this.exit();
                    break;
                default:
                    System.out.println("\n您的输入有误，请重新输入！！！\n");
            }
        }while (loop);
    }

    public void detail() {
        System.out.println("\n----------零钱通明细----------");
        System.out.println(details);
    }

    public void income() {
        System.out.println("\n" + "收益入账\n");
        System.out.print("请说明本次收益来源：");
        sourceOfIncome = scanner.next();
        System.out.print("请输入本次收益金额：");
        income = scanner.nextDouble();
        if (income >= 0)
        {
            balance += income;
        }
        else
        {
            income = 0;
            System.out.println("您输入的金额有误，请核对后重新输入！！！");
        }
        details += "\n收益入账\t" + "收益来源：" + sourceOfIncome + "\t金额：+" + income + "\t时间：" + simpleDateFormat.format(date) + "\t余额：" + balance;
    }

    public void consume() {
        System.out.println("\n" + "消   费\n");
        System.out.print("请输入本次消费说明：");
        consumptionDescription = scanner.next();
        System.out.print("请输入本次消费金额(" + "现有余额为：" + balance + ")：");
        consume = scanner.nextDouble();
        if (consume >= 0 && consume <= balance)
        {
            balance -= consume;
        }
        else
        {
            consume = 0;
            System.out.println("您输入的金额有误，请核对后重新输入！！！");
        }
        details += "\n消费出账\t" + "消费去处：" + consumptionDescription + "\t金额：+" + consume + "\t时间：" + simpleDateFormat.format(date) + "\t余额：" + balance;
    }

    public void exit() {
        System.out.print("请输入（yes/no）确认是否退出程序：");
        confirm = scanner.next();
        if ("yes".equals(confirm))
        {
            loop = false;
            System.out.println("欢迎下次使用！！！");
        }
        else if ("no".equals(confirm))
        {
            System.out.println("请继续使用！");
            this.menu();
        }
        else
        {
            System.out.println("您的输入有误！请重新输入！！！");
        }
    }
}
