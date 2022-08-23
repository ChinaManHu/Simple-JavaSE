package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/28
 */
public class DoWhileDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char strSpeak;
        do {
            System.out.println("盘他！！！");
            System.out.println("还钱吗？(yes/no)：");
            strSpeak = scanner.next().charAt(0);
        } while (strSpeak != 'y');
    }
}
