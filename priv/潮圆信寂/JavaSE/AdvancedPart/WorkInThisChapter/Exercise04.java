package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 20:36
 *
 */

/*
内部类
1.编一个类A，在类中定义局部内部类B，B中有一个私有常量name,有一个方法show()打印常量name。进行测试
2.进阶: A中也定义一个私有的变量name,在show方法中打印测试
 */

public class Exercise04 {
    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}

class A {
    private String name = "隐姓埋名";
    public void method() {
        class B {
            private String name = "潮圆信寂";

            public void show() {
                System.out.println("B类的name为：" + this.name);
                System.out.println("A类的name为：" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
