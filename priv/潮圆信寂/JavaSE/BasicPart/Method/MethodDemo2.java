package priv.潮圆信寂.JavaSE.BasicPart.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/7
 */
public class MethodDemo2 {
    public static void main(String[] args) {
        Parity parity = new Parity();
        boolean getParity = parity.judgingParity(8);
        System.out.println(getParity);
        parity.printCharArray(6, 6, 'x');
    }
}

class Parity {
    //判断奇偶性，默认奇数为true，偶数为false

    public boolean judgingParity(int number) {
        boolean parity;
        if (number % 2 == 0)
        {
            parity = false;
        }
        else
        {
            parity = true;
        }
        return parity;
    }

    //按照输入的行数和列数打印相应的字符

    public void printCharArray(int row, int column, char c) {
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}