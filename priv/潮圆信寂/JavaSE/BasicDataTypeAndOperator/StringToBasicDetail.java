package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/22
 */
public class StringToBasicDetail {
    public static void main(String[] args) {
        //基本的数据类型转换成字符串形式
        int number_1 = 666;
        float number_2 = 777.7f;
        double number_3 = 888.8;
        boolean boolean_1 = true;
        String str1 = number_1 + "";
        String str2 = number_2 + "";
        String str3 = number_3 + "";
        String str4 = boolean_1 + "";
        System.out.println(str1 + " " + str2 + " " + str3 + " " + str4);
        System.out.println(str1 + str2 + str3 + str4);
        System.out.println();

        //字符串转换成基本的数据类型
        int number_4 = Integer.parseInt(str1);
        float number_5 = Float.parseFloat(str2);
        double number_6 = Double.parseDouble(str3);
        boolean boolean_2 = Boolean.parseBoolean(str4);
        System.out.println(number_4 + "  " + number_5 + "  " + number_6 + "  " + boolean_2);
        System.out.println(number_4 + number_5 + number_6);
    }
}
