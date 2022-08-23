package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/7
 */
public class MethodTransmissionMechanismDetail2 {
    public static void main(String[] args) {
        //引用数据类型传递的是地址（传递的也是值，但是值为地址），可以通过形参影响实参
        int[] array = {1, 2, 3};
        System.out.println("调用其它类方法前main方法中的数组值：");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        ReferenceDataTypeTransferParameter referenceDataTypeTransferParameter = new ReferenceDataTypeTransferParameter();
        referenceDataTypeTransferParameter.changeArray(array);
        System.out.println("\n调用其它类方法后main方法中的数组值：");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}

class ReferenceDataTypeTransferParameter {
    public void changeArray(int[] array){
        array[0] = 100;
        System.out.println("\nchangeArray方法中的数组值：");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
    }
}