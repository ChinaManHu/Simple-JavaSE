package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/4
 */
public class ArraySeekTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入角色个数：");
        int numberOfLeadingRole = scanner.nextInt();
        String[] arr = new String[numberOfLeadingRole];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("请输入主角姓名：");
            String nameOfRole = scanner.next();
            arr[i] = nameOfRole;
        }
        System.out.print("请输入您想要查找的主角：");
        String seekOfRole = scanner.next();
        for (int i = 0; i < arr.length; i++)
        {
            if (seekOfRole.equals(arr[i]))
            {
                System.out.print("您想要查找的角色在第" + (i + 1) + "位！！！");
            }
        }
    }
}
