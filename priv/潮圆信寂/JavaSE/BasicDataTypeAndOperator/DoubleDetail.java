package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/20
 */
public class DoubleDetail {
    public static void main(String[] args) {
        double number_1 = 2.7;
        double number_2 = 8.1;
        double number_3 = number_2/3;
        System.out.println(number_1);
        System.out.println(number_3);

        //输出由于计算精度导致number_1和number_3的差值
        //Math.abs()返回双精度值的绝对值。如果参数不是负数，则返回参数。如果参数是否定的，则返回参数的否定
        System.out.println(Math.abs(number_1 - number_3));
        System.out.println(Math.abs(number_3 - number_1));
    }
}
