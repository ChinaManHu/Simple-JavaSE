package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class ForDemo1 {
    public static void main(String[] args) {
        //打印1~100之间所有9的倍数的整数，统计个数和总和
        int number = 0;
        int sum = 0;
        for (int i = 1;i <= 100; i++)
        {
            if ( i % 9 == 0)
            {
                number++;
                sum+=i;
                System.out.print("第"+number+"个为："+i+"\t");
            }
        }
        System.out.println();
        System.out.println("1~100之间9的倍数为整数的共有"+number+"个");
        System.out.println("总和为："+sum);
    }
}
