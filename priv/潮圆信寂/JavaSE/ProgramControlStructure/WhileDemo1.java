package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class WhileDemo1 {
    public static void main(String[] args) {
        //打印1~100之间所有能被3整除的数
        int i = 1;
        while (i <= 100)
        {
            if (i % 3 == 0)
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
}
