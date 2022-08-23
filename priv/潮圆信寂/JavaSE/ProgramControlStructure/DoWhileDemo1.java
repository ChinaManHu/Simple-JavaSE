package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/28
 */
public class DoWhileDemo1 {
    public static void main(String[] args) {
        //输出1~100及其总和
        int i = 1;
        int sum = 0;
        do {
            sum+=i;
            System.out.print(i + "\t");
            i++;
        }while (i <= 100);
        System.out.print("\n总和为："+sum);
    }
}
