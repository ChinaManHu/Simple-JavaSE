package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/27
 */
public class WhileDemo2 {
    public static void main(String[] args) {
        int i = 40;
        while (i <= 200)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + "\t");
            }
            i++;
        }
    }
}
