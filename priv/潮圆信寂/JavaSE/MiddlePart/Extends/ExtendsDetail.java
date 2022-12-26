package priv.潮圆信寂.JavaSE.MiddlePart.Extends;

/**
 * @author 潮圆信寂
 * @date 2022/8/17
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        //继承父类后的属性访问规则
        //(1) 首先看子类是否有该属性
        //(2) 如果子类有这个属性，并且可以访问，则返回信息
        //(3) 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
        //(4) 如果父类没有就按照(3)的规则，继续找上级父类，直到object...

        Son son = new Son();
        System.out.println();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
    }
}

class GrandFather {
    String name = "大头爷爷";
    int age = 99;
    String hobby = "钓鱼";

    public GrandFather() {
        System.out.println("父类的父类的构造函数被调用");
    }
}

class Father extends GrandFather {
    String name = "大头爸爸";
    int age = 55;

    public Father() {
        System.out.println("父类的构造函数被调用");
    }
}

class Son extends Father {
    String name = "大头儿子";

    public Son() {
        System.out.println("子类的构造函数被调用");
    }
}