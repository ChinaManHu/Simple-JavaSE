package priv.潮圆信寂.JavaSE.BasicPart.Method.Overload;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/11
 */
public class OverloadDemo1 {
    public static void main(String[] args) {
        //通过计算数值之和简单实现方能够发重载
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.calculate(2, 3, 5);
    }
}

class MyCalculator {

    //计算两个整数之和
    public void calculate(int n1, int n2)
    {
        int sum = n1 + n2;
        System.out.println("和为：" + sum);
    }

    //计算整数和double类型之和
    public void calculate(int n1, double n2)
    {
        double sum = n1 + n2;
        System.out.println("和为：" + sum);
    }

    //计算double类型和整数之和
    public void calculate(double n1, int n2)
    {
        double sum = n1 + n2;
        System.out.println("和为：" + sum);
    }

    //计算三个整数之和
    public void calculate(int n1, int n2, int n3)
    {
        int sum = n1 + n2 + n3;
        System.out.println("和为：" + sum);
    }
}