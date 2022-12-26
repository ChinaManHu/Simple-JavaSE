package priv.潮圆信寂.JavaSE.BasicPart.Method.Recursion;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/8
 */
public class RecursionExercise01 {
    public static void main(String[] args) {
        //猴子吃桃
        //每天吃剩余桃子的一半多一个
        //第10天还剩下一个桃子
        //求桃子原本的数量
        MonkeysEatPeaches monkeysEatPeaches = new MonkeysEatPeaches();
        int numberOfDays = 1;
        int numberOfPeaches = monkeysEatPeaches.showNumberOfPeaches(numberOfDays);
        System.out.println( "桃子原本数量：" + numberOfPeaches);
    }
}

class MonkeysEatPeaches {
    public int showNumberOfPeaches(int numberOfDays) {
        if (numberOfDays == 10)
        {
            return 1;
        }
        else
        {
            return (showNumberOfPeaches(numberOfDays + 1) + 1) * 2;
        }
    }
}