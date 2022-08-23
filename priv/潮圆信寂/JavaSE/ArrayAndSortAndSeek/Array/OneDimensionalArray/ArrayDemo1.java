package priv.潮圆信寂.JavaSE.ArrayAndSortAndSeek.Array.OneDimensionalArray;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/1
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //从数组中输出A~Z
        char[] letters = new char[26];
        int number = 0;
        for (char i = 'A'; i <= 'Z'; i++)
        {
            letters[number] = i;
            number++;
        }
        for (int i = 0; i < letters.length; i++)
        {
            System.out.println(letters[i]);
        }
    }
}
