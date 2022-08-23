package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/30
 */
public class BreakDetail {
    public static void main(String[] args) {
        label1:
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
            label2:
            for (int j = 11; j <= 15; j++)
            {
                System.out.println(j);
                //break label1;跳出label1标签处的循环
                // 1
                //11
                //break label2;跳出label2标签处的循环
                //1
                //11
                //2
                //11
                //3
                //11
                //4
                //11
                //5
                //11
            }
        }
    }
}
