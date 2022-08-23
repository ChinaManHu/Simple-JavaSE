package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/24
 */
public class HexadecimalConversionDetail {
    public static void main(String[] args) {
        //常用进制数以十进制表示时
        //二进制以0b/0B为开头，后接二进制数
        int number1 = 0b110;
        //八进制以0为开头，后接八进制数
        int number2 = 0110;
        //十进制
        int number3 = 110;
        //十六进制以0x/0X为开头，后接十六进制数
        int number4 = 0x110;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println();

        //十进制转换为二进制
        //Integer.toBinaryString(i)表示十进制转为二进制
        int number5 = 512;
        int numberOfBinary = Integer.parseInt(Integer.toBinaryString(number5));
        System.out.println(Integer.toBinaryString(number5));
        System.out.println(numberOfBinary);

        //十进制转换为八进制
        //Integer.toOctalString(i)表示十进制转为八进制
        int numberOfOctal = Integer.parseInt(Integer.toOctalString(number5));
        System.out.println(Integer.toOctalString(number5));
        System.out.println(numberOfOctal);

        //十进制转换为十六进制
        //Integer.toHexString(i)表示十进制转为十六进制
        int numberOfHexadecimal = Integer.parseInt(Integer.toHexString(number5));
        System.out.println(Integer.toHexString(number5));
        System.out.println(numberOfHexadecimal);
        //最终显示数字为字符串类型
        System.out.println(Integer.toHexString(number5)+1);
        //最终显示数字为int类型
        System.out.println(numberOfHexadecimal+1);

        //十进制转换为任意进制
        int numberOfQuaternary = Integer.parseInt(Integer.toString(number5,4));
        System.out.println(Integer.toString(number5,4));
        System.out.println(numberOfQuaternary);

        //任意进制转换为十进制
        String number_6 = String.valueOf(512);
        //Integer.parseInt((String) s,(int) a); a进制的字符串s转为十进制(返回Integer类型）
        int number_Decimal = Integer.parseInt(number_6,16);
        //Integer.valueOf(String s, int radix)radix进制的字符串s转为十进制(返回int类型)
        int number_decimal = Integer.valueOf(number_6,16);
        System.out.println(number_Decimal);
        System.out.println(number_decimal);

        //十六进制转换为二进制
        //将0x110强制转换为字符串类型
        String number_7 = String.valueOf(0x110);
        //将number_7转换为十进制类型后，再转换为二进制类型
        String number_8 = Integer.toBinaryString(Integer.parseInt(number_7));
        System.out.println(number_8);

        //二进制转换为八进制
        String number_9 = String.valueOf(0b1001000);
        String number_10 = Integer.toOctalString(Integer.parseInt(number_9));
        System.out.println(number_10);
    }
}
