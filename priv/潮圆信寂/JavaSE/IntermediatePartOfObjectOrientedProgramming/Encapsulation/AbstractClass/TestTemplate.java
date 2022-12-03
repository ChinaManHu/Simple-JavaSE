package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.AbstractClass;

import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/3 14:05
 *
 */


public class TestTemplate {
    public static void main(String[] args) {
//        本次代码测试抽象类和抽象方法以及模板类
//        模板方法（Template Method）模式的定义如下：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，
//        使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。它是一种类行为型模式。
//        该模式的主要优点如下:
//        它封装了不变部分，扩展可变部分。它把认为是不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展。
//        它在父类中提取了公共的部分代码，便于代码复用。部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则。
//        该模式的主要缺点如下:
//        对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，间接地增加了系统实现的复杂度。
//        父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。
//        由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要改一遍
//        原文链接：https://blog.csdn.net/kuangni5808/article/details/109990114

//        多次运行同一段代码耗费不同的运行时间可能的原因：
//        1、与操作系统的调度有关
//        2、现在的CPU支持动态调频
        Employee01 employee01 = new Employee01("老六");
        employee01.calculateTime();
        Employee02 employee02 = new Employee02("老八秘制小汉堡");
        employee02.calculateTime();
    }
}

abstract class Template {
    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start));
    }
}

class Employee01 extends Template{
    private String name;

    public Employee01(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void job() {
        for (int i = 0; i < 800000000; i++) {
            int num = 10;
            num += i;
        }
        System.out.print(this.getName());
    }
}

class Employee02 extends Template {
    private String name;

    public Employee02(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void job() {
        for (int i = 0; i < 800000000; i++) {
            int num = 10;
            num *= i;
        }
        System.out.print(this.getName());
    }
}