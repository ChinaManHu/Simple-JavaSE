package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/25
 */
public class SimpleTicketSellingSystem {
    public static void main(String[] args) {
        int childNumber;
        int adultNumber;
        int oldManNumber;
        int othersNumber;
        double totalTicketPrice;
        System.out.print("请输入当前的月份：");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if(month>=4 && month<=10)
        {
            System.out.println("温馨提示：18岁以下为儿童，18~60为成人，60以上为老人");
            double singleAdultPrice = 60;
            double singleChildPrice = singleAdultPrice/2;
            double singleOldManPrice = singleAdultPrice/3;
            System.out.print("请输入此批次儿童的人数：");
            Scanner scannerChild = new Scanner(System.in);
            childNumber = scannerChild.nextInt();
            System.out.print("请输入此批次成人的人数:");
            Scanner scannerAdult = new Scanner(System.in);
            adultNumber = scannerAdult.nextInt();
            System.out.print("请输入此批次老人的人数：");
            Scanner scannerOldMan = new Scanner(System.in);
            oldManNumber = scannerOldMan.nextInt();
            totalTicketPrice = singleChildPrice*childNumber + singleAdultPrice*adultNumber + singleOldManPrice*oldManNumber;
            System.out.println("此批次的顾客总票价为："+totalTicketPrice);
        }
        else if (month>=1 && month<=12)
        {
            System.out.println("温馨提示：18~60岁为成人");
            double singleAdultPrice = 40;
            double singleOtherManPrice = 20;
            System.out.print("请输入此批次成人的人数：");
            Scanner scannerAdult = new Scanner(System.in);
            adultNumber = scannerAdult.nextInt();
            System.out.print("请输入此批次其它年龄的人数：");
            Scanner scannerOthers = new Scanner(System.in);
            othersNumber = scannerOthers.nextInt();
            totalTicketPrice = adultNumber*singleAdultPrice + othersNumber*singleOtherManPrice;
            System.out.println("此批次的顾客总票价为："+totalTicketPrice);
        }
        else
        {
            System.out.println("您输入的月份有误！请重新输入！！！");
        }
    }
}
