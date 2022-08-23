package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/28
 */
public class DoWhileDemo2 {
    public static void main(String[] args) {
        int number = 0;
        int i = 1;
        do {
            if (i % 5 == 0 && i % 3 != 0)
            {
                number++;
            }
            i++;
        }while (i <= 200);
        System.out.print(number);
    }
}
