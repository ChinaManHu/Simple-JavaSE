package priv.潮圆信寂.JavaSE.MiddlePart.Polymorphic;

/**
 * @author 潮圆信寂
 * @date 2022/8/20
 */
public class UpwardAndDownwardTransformationDetail {
    public static void main(String[] args) {
        //多态的前提是:两个对象(类)存在继承关系
        //多态的向上转型
        //本质:父类的引用指向了子类的对象
        //语法:父类类型 引用名 = new 子类类型();
        //特点:编译类型看左边，运行类型看右边
        //左边的为编译时    Animal02 animal02
        //右边的为运行时    new Cat02()
        //可以调用父类中的所有成员(需遵守访问权限)，不能调用子类中特有成员;
        //最终运行效果看子类的具体实现!

        //多态的向下转型
        //语法:子类类型 引用名 = (子类类型) 父类引用;
        //只能强转父类的引用，不能强转父类的对象，要求父类的引用必须指向的是当前目标类型的对象
        //（可以粗略理解为：强转的对象需要之前就是子类的，只是子类在之前被向上转型为父类的引用）
        //可以调用子类类型中所有的成员

        Animal02 animal02 = new Cat02();
        animal02.eat02();

        //父类中的方法(子类中未重写)
        animal02.speak();

        Cat02 cat020 = (Cat02) animal02;

        //子类中特有的方法
        cat020.catchMouse();
    }
}

class Animal02 {
    String name;

    public void run02() {
        System.out.println("跑");
    }

    public void eat02() {
        System.out.println("吃");
    }

    public void speak() {
        System.out.println("I am 蔡徐坤（鸡哥），你干嘛");
    }
}

class Cat02 extends Animal02 {
    @Override
    public void eat02() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
