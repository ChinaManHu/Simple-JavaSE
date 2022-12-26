package priv.潮圆信寂.JavaSE.BasicPart;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/6
 */
public class ObjectDemo2 {
    public static void main(String[] args) {
        PersonOne p1 = new PersonOne();
        p1.age = 18;
        p1.name = "潮圆信寂";
//        PersonOne p2 = p1;
//        p2.age = 100;
//        p2 = null;
//        System.out.println(p1.age);
//        System.out.println(p2.age);
//        100
//        Exception in thread "main" java.lang.NullPointerException
//        at JavaSE.BasicPartOfObjectOrientedProgramming.ObjectDemo2.main(ObjectDemo2.java:17)

//        PersonOne p2 = new PersonOne();
//        p2 = p1;
//        p2.age = 99;
//        p2 = null;
//        System.out.println(p1.age);
//        System.out.println(p2.age);
//        99
//        Exception in thread "main" java.lang.NullPointerException
//        at JavaSE.BasicPartOfObjectOrientedProgramming.ObjectDemo2.main(ObjectDemo2.java:26)
    }
}

class PersonOne {
    int age;
    String name;
}

