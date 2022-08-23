package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method.Constructor;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/12
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        //构造器的简单使用及构造器的重载
        PersonSix personSix1 = new PersonSix("潮圆信寂", 18);
        PersonSix personSix2 = new PersonSix("潮圆信寂!!!");
        PersonSix personSix3 = new PersonSix();
        System.out.println(personSix1.age);
        System.out.println(personSix1.name);
        System.out.println(personSix2.name);
        System.out.println(personSix3.age);
        System.out.println(personSix3.name);
    }
}

class PersonSix {
    String name;
    int age;

    //第一个构造器
    PersonSix(String mainName, int mainAge)
    {
        System.out.println("构造器被调用！！！");
        name = mainName;
        age = mainAge;
    }

    //第二个构造器
    //构造器的重载
    PersonSix(String mainName)
    {
        name = mainName;
    }

    //无参构造器
    //定义一个无参构造器，利用构造器设置所有人的age属性的初始值为18
    PersonSix()
    {
        age = 18;
    }
}