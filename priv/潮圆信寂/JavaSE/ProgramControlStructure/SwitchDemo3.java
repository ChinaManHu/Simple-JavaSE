package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        //输入月份，判断它归属的季节
        //这里的case语句采用穿透写法
        System.out.print("请输入您想查询的月份：");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.print("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.print("冬季");
                break;
            default:
                System.out.print("您输入的月份有误！请重新输入！！！");
        }
    }
}
