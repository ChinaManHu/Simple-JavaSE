package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/2
 */
public class ArrayAssignmentMechanismDetail {
    public static void main(String[] args) {
        //值传递（值拷贝）
        //n2的值改变不影响n1
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println(n2);
        System.out.println();
        //引用传递（地址拷贝）
        //arr2[]数组的值改变影响arr1[]
        //此时arr1[]和arr2[]在栈中的地址相同，地址指向的堆中的数组为同一个，可以算是arr1[]和arr2[]共用堆中的一个数组
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        System.out.print("arr2[]数组的值改变之前，arr1[]和arr2[]数组：");
        for (int i = 0; i <arr1.length; i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        for (int i = 0; i <arr2.length; i++)
        {
            System.out.print(arr2[i]+"\t");
        }
        arr2[1] = 22;
        System.out.print("\narr2[]数组的值改变之后，arr1[]和arr2[]数组：");
        for (int i = 0; i <arr1.length; i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        for (int i = 0; i <arr2.length; i++)
        {
            System.out.print(arr2[i]+"\t");
        }
        //数组拷贝
        //arr3[]和arr1[]在栈中的地址不同，地址指向的堆中的数组也就不同,只是在堆中两个数组的初始值相同，所以arr3[]的值改变时不影响arr1[]
        //arr1[]和arr2[]的数据空间相同，而arr3[]开辟了新的数据空间,arr3[]和arr1[]的数据空间不同
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }
        System.out.print("\narr3[]数组的值改变之前，arr1[]和arr3[]数组：");
        for (int i = 0; i <arr1.length; i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        for (int i = 0; i <arr3.length; i++)
        {
            System.out.print(arr3[i]+"\t");
        }
        arr3[1] = 33;
        System.out.print("\narr3[]数组的值改变之后，arr1[]和arr3[]数组：");
        for (int i = 0; i <arr1.length; i++)
        {
            System.out.print(arr1[i]+"\t");
        }
        for (int i = 0; i <arr3.length; i++)
        {
            System.out.print(arr3[i]+"\t");
        }
    }
}
