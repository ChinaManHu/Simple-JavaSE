package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入阳历的日期：");
        Scanner scanner = new Scanner(System.in);
        //char solarCalendar = (char)scanner.nextInt();效果相同
        //int solarCalendar = scanner.next().charAt(0);输出的为字符形式,，且从显示台读取时只读取.charAt()中索引下标的字符
        int solarCalendar = scanner.nextInt();
        switch (solarCalendar) {
            case 3:
                System.out.println("初一");
                break;
            case '3':
                System.out.println("您的输入为字符形式!");
                break;
            case 4:
                System.out.println("初二");
                break;
            case 5:
                System.out.println("初三");
                break;
            case 6:
                System.out.println("初四");
                break;
            case 7:
                System.out.println("初五");
                break;
            case 8:
                System.out.println("初六");
                break;
            case 9:
                System.out.println("初七");
                break;
            case 10:
                System.out.println("初八");
                break;
            default:
                System.out.println("您输入的阳历不在系统目录范围内！！！");
        }
    }
}
