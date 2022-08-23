package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.print("请输入需要转化的字符：");
        Scanner scanner = new Scanner(System.in);
        String getCharacter = scanner.next();
        switch (getCharacter) {
            case "a":
                System.out.println('A');
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            case "d":
                System.out.println("D");
                break;
            case "e":
                System.out.println("E");
                break;
            default:
                System.out.println("other!!!");
        }
    }
}
