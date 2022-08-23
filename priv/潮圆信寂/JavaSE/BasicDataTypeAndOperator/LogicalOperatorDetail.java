package priv.潮圆信寂.JavaSE.BasicDataTypeAndOperator;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/23
 */
public class LogicalOperatorDetail {
    public static void main(String[] args) {
        int number_1 = 5;
        int number_2 = 5;
        int number_3 = 5;
        int number_4 = 5;
        int number_5 = 5;
        int number_6 = 5;
        int number_7 = 5;
        int number_8 = 5;

        // & 是与，&&是短路与
        // && 是左边条件不满足就终止了，不会继续计算右边条件；而&是无论左边是否满足都会继续执行右边。
        // a && b , 假如计算得出a为假，那么就不会继续计算b的真假值了；假如a是真，那么会继续计算b，当b也是真时，a&&b为真。
        // a & b , 无论a是真假，都会继续计算b的真假值
        if(number_1++==6 & ++number_2==6) {
            number_1 = 110;
        }//6,6
        System.out.println("number_1="+number_1+"  number_2="+number_2);
        if(number_3++==6 && ++number_4==6) {
            number_3 = 120;
        }//6,5
        System.out.println("number_3="+number_3+"  number_4="+number_4);

        //&,&&和|,||原理相似
        if(number_5++==6 | ++number_6==6) {
            number_5 = 130;
        }//130,6
        System.out.println("number_5="+number_5+"  number_6="+number_6);
        if(number_7++==6 || ++number_8==6) {
            number_7 = 140;
        }//140,6
        System.out.println("number_7="+number_7+"  number_8="+number_8);
    }
}
