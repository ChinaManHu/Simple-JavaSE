package priv.潮圆信寂.JavaSE;

/**
 *
 *@author 潮圆信寂
 *@date 2022/7/18
 */
public class Hello {
    public static void main(String[] args) {
//        String str1 = "aaa a";
//        String str2 = "aaa a";
//        int[] arr = {3, 2, 6, 8, 7 };
//        Arrays.sort(arr);
//        if (str1 == str2)
//        {
//            System.out.println("11111");
//        }
//        Example example = new Example();
//        example.y = 19;
//        System.out.println(example.y);

        for (int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数：" + args[i]);
        }
        YY yy01 = YY.getYYInstance();
        YY yy02 = YY.getYYInstance();
        System.out.println(yy01 == yy02);
        System.out.println(yy01);
        System.out.println(yy02);
        XX xx01 = XX.getXXInstance();
        XX xx02 = XX.getXXInstance();
        System.out.println(xx01 == xx02);
        System.out.println(xx01);
        System.out.println(xx02);
    }
}
class Example{
    public static int y = 0;
}

class YY {
    //  饿汉式
    private String name;

    private YY(String name) {
        this.name = name;
    }

    private final static YY yy = new YY("yy");

    public static YY getYYInstance() {
        return yy;
    }

    @Override
    public String toString() {
        return "YY{" +
                "name='" + name + '\'' +
                '}';
    }
}

class XX {
    //  懒汉式
    private String name;

    private XX(String name) {
        this.name = name;
    }
    private static XX xx;

    public static XX getXXInstance() {
        if (xx == null)
        {
            xx = new XX("xx");
        }
        return xx;
    }

    @Override
    public String toString() {
        return "XX{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface AAA{
    void getAAA();
}

interface BBB{
    void getBBB();
}

interface CCC extends AAA, BBB {
    void getCCC();
}

class DDD implements CCC{


    @Override
    public void getBBB() {

    }

    @Override
    public void getCCC() {

    }

    @Override
    public void getAAA() {

    }
}

interface A{
    int a = 0;
}

class B {
    int a = 1;
}

class C extends B implements A {
    public void pA()
    {
        System.out.println(super.a + A.a);
    }

    public static void main(String[] args) {
        new C().pA();
    }
}