package priv.潮圆信寂.JavaSE.ProgramControlStructure;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/30
 */
public class BreakDemo2 {
    public static void main(String[] args) {
        String strName;
        String strPassword;
        String strRightName = "潮圆信寂";
        String strRightPassword = "666";
        Scanner scannerName = new Scanner(System.in);
        Scanner scannerPassword = new Scanner(System.in);
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("请输入用户名：");
            strName = scannerName.next();
            System.out.print("请输入用户密码：");
            strPassword = scannerPassword.next();
            if (strName.equals(strRightName) && strPassword.equals(strRightPassword))
            {
                System.out.println("登录成功！！！");
                break;
            }
            else
            {
                System.out.println("用户名或密码错误");
                if (i < 3)
                {
                    System.out.println("您还有"+(3-i)+"次登录机会！");
                }
                if (i == 3)
                {
                    System.out.println("您的登录失败次数已达上限，账号已被锁定！！！");
                }
            }
        }
    }
}
