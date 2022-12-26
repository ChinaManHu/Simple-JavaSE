package priv.潮圆信寂.JavaSE.AdvancedPart.CodeBlock;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/1 20:09
 *
 */


public class CodeBlockDetail02 {
    public static void main(String[] args) {
//加载类信息->加载静态代码块和静态属性初始化(按代码的先后顺序执行)->创建对象->加载普通代码块和普通变量(按代码的先后顺序执行)->构造方法
//父静态(按顺序) -> 子静态(按顺序) -> 父普通(按顺序) -> 父构造 -> 子普通(按顺序) -> 子构造
//静态代码块只能调用静态成员，普通方法可以调用任意成员
        Student student = new Student();

    }
}

class Student {
    private String name = getName();

    {
        System.out.println("Student类的普通代码块");
    }

    public String getName() {
        System.out.println("getName()方法被调用");
        return name = "潮圆信寂";
    }
//    Student类的静态代码块
//    getAge()方法被调用
//    getName()方法被调用
//    Student类的普通代码块

//    {
//        System.out.println("Student类的普通代码块");
//    }
//
//    private String name = getName();
//
//    public String getName() {
//        System.out.println("getName()方法被调用");
//        return name = "潮圆信寂";
//    }
//    Student类的静态代码块
//    getAge()方法被调用
//    Student类的普通代码块
//    getName()方法被调用

//    private static int age = getAge();
//
//    static {
//        System.out.println("Student类的静态代码块");
//    }
//
//    public static int getAge() {
//        System.out.println("getAge()方法被调用");
//        return age = 21;
//    }
//    getAge()方法被调用
//    Student类的静态代码块

    static {
        System.out.println("Student类的静态代码块");
    }

    private static int age = getAge();

    public static int getAge() {
        System.out.println("getAge()方法被调用");
        return age = 21;
    }
//    Student类的静态代码块
//    getAge()方法被调用
}