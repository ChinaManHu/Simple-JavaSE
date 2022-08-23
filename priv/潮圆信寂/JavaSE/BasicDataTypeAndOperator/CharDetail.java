package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/20
 */

//编码	    大小  	               支持语言
//ASCII	    1个字节	                英文
//Unicode	2个字节（生僻字4个）	   所有语言
//UTF-8	    1-6个字节，英文字母1个字节，汉字3个字节，生僻字4-6个字节

public class CharDetail {
    public static void main(String[] args) {
        //char的本质相当于一个数字，它都有对应的一个Unicode码
        //输出Unicode码对应的字符
        char c1 = 97;
        System.out.println(c1);

        //强制类型转换，输出'a'对应的ASC LL码
        char c2 = 'a';
        System.out.println((int)c2);

        //模仿上文
        char c3 = '胡';
        System.out.println((int)c3);
        char c4 = 32993;
        System.out.println(c4);

        //char类型数据运算
        char c5 = 'a' + 1;
        System.out.println(c5);
        System.out.println((int)c5);
    }
}
