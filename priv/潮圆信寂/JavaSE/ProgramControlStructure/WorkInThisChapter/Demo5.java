package priv.潮圆信寂.JavaSE.ProgramControlStructure.WorkInThisChapter;

public class Demo5 {
    public static void main(String[] args) {
//        char str1 = 'a';
//        char str2 = 'z';
//        char str3 = 'A';
//        char str4 = 'Z';
//        97
//        122
//        65
//        90
//        a
//        System.out.println((int)str1);
//        System.out.println((int)str2);
//        System.out.println((int)str3);
//        System.out.println((int)str4);
//        System.out.println((char)97);
        for (int i = 65; i <= 90; i++)
        {
            System.out.print((char) (i+32) + " ");
            System.out.print((char) i + "\t");
        }
    }
}
