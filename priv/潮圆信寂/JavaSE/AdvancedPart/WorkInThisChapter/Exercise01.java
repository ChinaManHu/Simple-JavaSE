package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 19:46
 *
 */

/*
1.在Frock类中声明私有的静态属性currentNum[int类型],初始值为100000,作为衣服出厂的序列号起始值。
2.声明公有的静态方法getNextNum,作为生成上衣唯一序列号的方法。每调用一次,将currentNum增加100,并作为返回值。
3.在Exercise01类的main方法中,分两次调用getNextNum方法,获取序列号并打印输出。
4.在Frock类中声明serialNumber(序列号)属性,并提供对应的get方法;
5.在Frock类的构造器中,通过调用getNextNum方法为Frock对象获取唯一序列号,赋给serialNumber属性。
6.在Exercise01类的main方法中,分别创建三个Frock对象,并打印三个对象的序列号,验证是否为按100递增。
 */

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("第一次的序列号为：" + Forck.getNextNum());
        System.out.println("第二次的序列号为：" + Forck.getNextNum());
        Forck forck1 = new Forck();
        Forck forck2 = new Forck();
        Forck forck3 = new Forck();
        System.out.println(forck1.serialNumber);
        System.out.println(forck2.serialNumber);
        System.out.println(forck3.serialNumber);
    }
}

class Forck {
    private static int currentNum = 100000;

    public int serialNumber;

    public Forck() {
        serialNumber = Forck.getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    @Override
    public String toString() {
        return "Forck{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}