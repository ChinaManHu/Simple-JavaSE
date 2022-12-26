package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.MemberInnerClass;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/6 11:01
 *
 */

public class Test01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}

class Outer {
    private int n1 = 99;
    public String str = "潮圆信寂";

    class Inner {
        public void getElement() {
            System.out.println("n1= " + n1 + "\n成员：" + str);
        }
    }

    public void show() {
        Inner inner = new Inner();
        inner.getElement();
    }
}