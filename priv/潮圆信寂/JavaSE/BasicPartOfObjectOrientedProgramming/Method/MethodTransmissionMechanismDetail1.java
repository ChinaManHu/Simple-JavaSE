package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/7
 */
public class MethodTransmissionMechanismDetail1 {
    public static void main(String[] args){
        //结论：基本数据类型传参，传递的是值（值拷贝），形参的任何改变不影响实参
        BasicDataTypeTransferParameter basicDataTypeTransferParameter = new BasicDataTypeTransferParameter();
        int number1 = 66;
        int number2 = 666;
        basicDataTypeTransferParameter.swap(number1, number2);
        System.out.println("\nmain方法中的值\n第一个数：" + number1 + "\t第二个数：" + number2);
    }
}

class BasicDataTypeTransferParameter {
    public void swap(int number3, int number4){
        System.out.print("swap方法传参交换前的值\n第一个数：" + number3 + "\t第二个数：" + number4 );
        int temp = number3;
        number3 = number4;
        number4 = temp;
        System.out.print("\nswap方法传参交换后的值\n第一个数：" + number3 + "\t第二个数：" + number4 );
    }
}
