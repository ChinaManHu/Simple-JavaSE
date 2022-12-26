package priv.潮圆信寂.JavaSE.BasicPart.Method.VariableParameters;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/12
 */
public class VariableParametersDetail {
    public static void main(String[] args) {
        //可变参数的实参可以为0个或任意多个。
        //可变参数的实参可以为数组。
        //可变参数的本质就是数组。
        //可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后。
        //一个形参列表中只能出现一个可变参数。
        VariableParameters variableParameters = new VariableParameters();
        System.out.println(variableParameters.sum(1, 2, 3, 4, 5));
        System.out.println(variableParameters.sum(6, 7, 8, 9, 10));
        System.out.println(variableParameters.getSum("潮圆信寂",6, 60, 600));
    }
}

class VariableParameters {
    public int sum(int...numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            result += numbers[i];
        }
        return result;
    }
    public String getSum(String str, int...numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length;i++)
        {
            result += numbers[i];
        }
        String s = Integer.toString(result);
        str = str + s;
        return str;
    }
}