package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/21
 */
public class DataTypeConversionDetail {
    public static void main(String[] args) {
        //精度小的转换为大的(自动转换)，精度大的转换为小的(强制转换)
        //在java中整数类型byte,short与字符型char之间不可自动转换，但三者之间可以进行运算，在运算时会转换为int类型。
        byte number_1 = 1;
        short number_2 = 11;
        char number_3 = 111;
        int number_4 = number_1 + number_2;
        int number_5 = number_1 + number_3;
        int number_6 = number_2 + number_3;
        System.out.println(number_4);
        System.out.println(number_5);
        System.out.println(number_6);
        System.out.println();

        //强制转换数据类型时造成的精度降低和溢出
        //高精度强制转换为低精度，精度降低
        int number_7 = (int)1.9;
        System.out.println(number_7);
        //数据大小超出数据类型的范围，数据溢出
        int number_8 = 1000;
        byte number_9 = (byte)number_8;
        System.out.println(number_9);
        System.out.println();

        //char类型通常情况下只能保存int类型的常量值，不能保存int类型的变量值
        //char类型保存int类型变量值时需要强制转换
        char c1 = 100;
        int number_10 = 110;
        //char c2 = number_10;
        char c3 = (char)number_10;
        System.out.println(c3);
        System.out.println((int)c3);
        System.out.println();

        //强制转换符号只针对最近的操作数有效，往往会使用小括号提升优先级
        //int number_11 = (int)10*3.5 + 6*1.5;
        int number_12 = (int)(10*3.5 + 6*1.5);
        System.out.println(number_12);
        int number_13 = (int)3.5*10;
        System.out.println(number_13);
    }
}
