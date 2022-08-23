package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array;

/**
 * @author 潮圆信寂
 * @date 2022/8/5
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //随机生成10个整数（1~100）保存到数组，倒序打印并求平均值
        int[] arr = new int[10];
        int number;
        int temp;
        int sum = 0;
        System.out.print("倒序前：");
        for (int i = 0; i < arr.length; i++) {
            number = (int) (Math.random() * 100);
            arr[i] = number;
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\n倒序后：");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+"\t");
            sum += arr[i];
        }
        System.out.print("\n平均值为：" + (sum/ arr.length));
    }
}
