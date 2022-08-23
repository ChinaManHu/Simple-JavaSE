package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

import java.util.Scanner;

/**
 * @author 潮圆信寂
 * @date 2022/8/3
 */
public class ArrayReductionTest {
    public static void main(String[] args) {
        //对数组进行缩减，由用户决定是否继续缩减。
        // 每次缩减最后一个元素，默认最少缩减一次，后续的缩减由用户决定
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arrNew = new int[arr.length - 1];
        Scanner scanner = new Scanner(System.in);
        String str = "yes";
        while ("yes".equals(str)) {
            if (arr.length == 1) {
                System.out.print("数组已不能再缩减！！！");
                break;
            }
            System.out.print("缩减前的数组为：");
            for (int i : arr) {
                System.out.print(i + "\t");
            }
            System.out.print("\n缩减后的数组为：");
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];
                System.out.print(arrNew[i] + "\t");
            }
            System.out.print("\n是否继续缩减？(yes/no):");
            str = scanner.next();
            arr = arrNew;
            arrNew = new int[arr.length - 1];
        }
        System.out.println("\n缩减后的最终数组为：");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
