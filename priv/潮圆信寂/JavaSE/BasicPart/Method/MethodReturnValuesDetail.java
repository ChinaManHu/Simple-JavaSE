package priv.潮圆信寂.JavaSE.BasicPart.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/7
 */
public class MethodReturnValuesDetail {
    public static void main(String[] args) {
        //实现一个方法返回多个结果
        //解决办法：多个返回值以数组形式返回
        MultipleReturnValues returnValues = new MultipleReturnValues();
        int[] arr = returnValues.showMultipleReturnValues(12, 8);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
    }
}

class MultipleReturnValues {
    public int[] showMultipleReturnValues(int number1, int number2) {
        int[] result = new int[4];
        result[0] = number1 + number2;
        result[1] = number1 - number2;
        result[2] = number1 * number2;
        result[3] = number1 / number2;
        return result;
    }
}