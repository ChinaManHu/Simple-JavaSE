package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.LocalInnerClass;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/4 16:07
 *
 */


public class Test {
    public static void main(String[] args) {
        //  局部内部类的简单测试
        //  以Outer类为例：当局部内部类(Inner)和外部类(Outer)的成员重名时，默认遵循就近原则
        //               此时访问外部类的成员，需要  外部类.this.成员
        Outer outer = new Outer();
        outer.say();
        System.out.println("outer的哈希code：" + outer);
    }
}

class Outer {
    private Integer id = 110;
    private static String name = "张三";

    public Outer() {
    }
    public void say() {
        class Inner {
            private Integer id = 21;
            public void show() {
                System.out.println(name + "局部内部类的实例方法");
                System.out.println("Outer类的成员（id）：" + Outer.this.id);
                System.out.println("Outer.this的哈希code：" + Outer.this);
                System.out.println("Inner类的成员（id）：" + id);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}