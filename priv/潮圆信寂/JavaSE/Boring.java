package priv.潮圆信寂.JavaSE;

import java.util.Scanner;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/25 18:13
 *
 */

public class Boring {
    static Scanner scanner = new Scanner(System.in);
    static boolean key = true;
    static int choice = 3;
    static double balance = 0;
    static double income =  0;
    static double pay = 0;

    public static void main(String[] args) {
        showScreen();
    }

    public static void showBalance() {
        System.out.println("您现在的余额为：" + balance);
    }

    public static void save() {
        System.out.println("请输入您要存入的金额：");
        income = scanner.nextDouble();
        if (income >= 0)
        {
            balance += income;
        }
        else
        {
            System.out.println("您输入的金额有误！");
        }
    }

    public static void withdraw() {
        System.out.println("请输入您要取出的金额：");
        pay = scanner.nextDouble();
        if (pay >= 0 && pay <= balance)
        {
            balance -= pay;
        }
        else
        {
            System.out.println("您输入的金额有误！");
        }
    }

    public static void showScreen() {
        do {
            System.out.println("----------------");
            System.out.println("|简易存取钱系统  |");
            System.out.println("|(1)存钱：      |");
            System.out.println("|(2)取钱：      |");
            System.out.println("|(3)显示余额:   |");
            System.out.println("|(4)退出：      |");
            System.out.println("----------------");
            System.out.print("请输入您的选择：");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    save();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    showBalance();
                    break;
                case 4:
                    key = false;
                    break;
                default:
                    System.out.println("感谢使用");
                    break;
            }
        }while (key);
    }
}
