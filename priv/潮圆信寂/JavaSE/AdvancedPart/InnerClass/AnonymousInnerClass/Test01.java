package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.AnonymousInnerClass;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/5 14:51
 *
 */


public class Test01 {
    public static void main(String[] args) {
        //普通的局部内部类实现接口
        Outer outer = new Outer();
        outer.Method();
    }
}

interface Usb {
    void insert();
}

class Outer {
    private Integer n1 = 110;
    public Outer() {}

    public void Method() {
        class IPhone implements Usb{
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            IPhone(String name) {
                this.name = name;
            }

            @Override
            public void insert() {
                System.out.println(this.name + "插入成功...");
            }
        }
        IPhone iPhone = new IPhone("IPhone    ");
        iPhone.getName();
        iPhone.insert();
    }
}


//public class Test {
//    public static void main(String[] args) {
//        //匿名内部类实现接口
//        Outer outer = new Outer("e");
//        outer.Method();
//    }
//}
//
//class Outer{
//    private String name;
//
//    public Outer(String name) {
//        this.name = name;
//    }
//
//    public void Method() {
//        Usb iphone = new Usb() {
//            @Override
//            public void insert() {
//                System.out.println("IPhone插入成功...");
//            }
//        };
//        iphone.insert();
//    }
//}
//
//interface Usb {
//    void insert();
//}
