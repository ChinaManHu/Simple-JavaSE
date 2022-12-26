package priv.潮圆信寂.JavaSE.MiddlePart.Polymorphic;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/21
 */
public class PropertyOverrideAndInstanceOfDetail {
    public static void main(String[] args) {
        //属性没有重写之说，属性的值看编译类型，即创建对象时的左边部分类型
        Aa aa1 = new Bb();
        System.out.println(aa1.x);
        Bb bb = new Bb();
        System.out.println(bb.x);
        Aa aa2 = new Aa();
        Object obj = new Object();
        //instanceOf操作符，用于判断对象的运行类型是否为XX类型或XX类型的子类型
        //true
        System.out.println(aa1 instanceof Aa);
        //true
        System.out.println(aa1 instanceof Bb);
        //true
        System.out.println(bb instanceof Aa);
        //true
        System.out.println(bb instanceof Bb);
        //true
        System.out.println(aa2 instanceof Aa);
        //false
        System.out.println(aa2 instanceof Bb);
        //false
        System.out.println(obj instanceof Aa);
        //false
        System.out.println(obj instanceof Bb);
        //true
        System.out.println(aa1 instanceof Object);
        //true
        System.out.println(aa2 instanceof Object);
        //true
        System.out.println(bb instanceof Object);
        //System.out.println(bb instanceof Cc);编译错误
        //System.out.println(aa instanceof Cc);编译错误
    }
}

class Aa {
    int x = 10;
}

class Bb extends Aa{
    int x = 20;
}

class Cc {
}