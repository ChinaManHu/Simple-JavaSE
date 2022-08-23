package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/24
 */
public class BitOperationTest {
    public static void main(String[] args) {
        //（左移操作符）<<
        //对数进行操作时，左移多出来的直接溢出，缺少的用0补上。
        //0000 0000 0000 0001->0000 0000 0000 0100
        int number_1 = 1<<2;
        System.out.println(number_1);
        //1000 0000 0000 0001->1000 0000 0000 0100
        int number_2 = -1<<2;
        System.out.println(number_2);
        //（右移操作符）>>
        //对数进行操作时，每移一次，最高位由原来地补充（正数补0，负数补1），多出来的溢出。
        //0000 0000 0000 1000->0000 0000 0000 0010
        int number_3 = 8>>2;
        System.out.println(number_3);
        //1000 0000 0000 1000->1000 0000 0000 0010
        int number_4 = -8>>2;
        System.out.println(number_4);
    }
}
