package priv.潮圆信寂.JavaSE.ProgramControlStructure.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/31
 */
public class WhileBreakDemo1 {
    public static void main(String[] args) {
        /*
        某人有100,000元，每经过一次路口，需要交费，规则如下:
        1)当现金> 50000时， 每次交5%
        2)当现金< =50000时，每次交1000
        编程计算该人可以经过多少次路口，要求:使用while+ break方式完成
         */
        double balance = 100000;
        int numberOfCrossing = 0;
        while (balance > 0)
        {
            if (balance < 1000)
            {
                break;
            }
            else if (balance > 50000)
            {
                balance = balance - balance*0.05;
            }
            else
            {
                balance = balance - 1000;
            }
            numberOfCrossing++;
        }
        System.out.println(numberOfCrossing);
    }
}
