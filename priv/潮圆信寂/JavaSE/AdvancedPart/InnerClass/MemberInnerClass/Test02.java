package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.MemberInnerClass;

/**
 * @author 潮圆信寂
 * @date 2022/12/6 14:23
 */

public class Test02 {
    public static void main(String[] args) {
        //  外部类访问内部类
        //  第一种，先创建一个外部类实例化对象(如：outer02)，再 外部类.内部类  内部类实例化对象 = 外部类实例化对象.new 内部类()
        Outer02 outer02 = new Outer02();
        outer02.fun();
        Outer02.Inner inner01 = outer02.new Inner();
        inner01.getInfo();
        //  第二种，先创建一个外部类实例化对象(如：outer02)，再在外部类中添加一个内部类的返回对象方法(如：getInstance())
        //  然后在 外部类.内部类 内部类实例化对象 = 外部类实例化对象.外部类中返回内部类对象的方法(如：getInstance())
        Outer02.Inner inner02 = outer02.getInstance();
        inner02.getInfo();
        //  第三种，严格意义上不算一种新的方法，只是将创建外部类实例化对象的那一步，第一种或第二种中创建成员内部类实例化对象的一步，两者合并
        Outer02.Inner inner03 = new Outer02().getInstance();
        Outer02.Inner inner04 = new Outer02().new Inner();
        inner03.getInfo();
        inner04.getInfo();
        outer02.getN1();
    }
}

class Outer02 {

//  当内部类的成员和外部类的成员名相同时，对于内部类对象：遵循就近原则，优先访问内部类中的成员。外部类的成员访问可以：外部类.this.成员
//                                 对于外部类对象:也遵循就近原则，优先访问外部类中的成员。内部类的成员可以：new Inner().成员

    private int n1 = 100;
    private static String name = "张三";

    public void fun() {
        System.out.println("fun()方法");
    }

    class Inner {
        private int n1 = 99;
        public void getInfo() {
            System.out.println("外部类的n1：" + Outer02.this.n1 +"\t内部类的n1：" + n1 + "\nname:" + name);
        }
    }
    public Inner getInstance() {
        return new Inner();
    }
    public void getInfo() {
        System.out.println("外部类的getInfo()方法...");
    }
    public void getN1() {
        System.out.println("外部类的n1：" + n1);
        System.out.println("内部类的n1：" + new Inner().n1);
    }
}