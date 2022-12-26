package priv.潮圆信寂.JavaSE.AdvancedPart.SingleCaseDesignMode;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/2 13:56
 *
 */


public class LazyHanStyleOfSingleCaseDesignMode {
    public static void main(String[] args) {
//        饿汉式：
//        一上来就实例化一个对象，当外部调用 get 方法时直接将对象返回出去
//        线程安全，对象早已经实例化好了，因为无论如何都只是同一个对象。
//        懒汉式：
//        一开始不需要实例化对象，直到外部调用 get 方法的时候才实例化对象并返回出去
//        线程不安全，因为不同线程在调用方法时对象状态仍然为null，大家都会实例化对象并返回，从而造成数据不同步，
//        可以加上synchronized关键字实现同步代码块。
//        原文链接：https://blog.csdn.net/qq_45834685/article/details/121466970

//        饿汉式存在浪费资源的可能。因为如果程序员一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，
//        懒汉式是使用时才创建，就不存在这个问题。


        GirlFriends girlFriends01 = GirlFriends.getInstance();
        GirlFriends girlFriends02 = GirlFriends.getInstance();
        System.out.println(girlFriends01.toString());
        System.out.println(girlFriends02.toString());
        if (girlFriends01 == girlFriends02)
        {
            System.out.println("同一个对象");
        }
    }
}

//  懒汉式
//  步骤:(1)构造器私有化--->防止直接new    (2)类的内部创建对象    (3)向外暴露一个静态的公共方法。如:getInstance()

class GirlFriends {
    private String name;

    // 1.类内创建一个私有的，静态的类类型的对象
    // 目的：
    // 首先防止外部通过使用 Singleton1.singleton1 = null; 将对象报废（private）
    // 其次是为了在类内部实例化一个对象，提升为类层级，外部便于使用静态方法返回当前对象，因为静态方法只能调用静态对象（static）
    // 懒汉式：
    // 一开始不需要实例化对象，直到外部调用 get 方法的时候才实例化对象并返回出去

    private static GirlFriends girlFriends = null;

    // 2.私有化构造方法
    // 目的：
    // 只允许在类内实例化对象，如果可以在类外实例化对象，那么对象的数量就无法保证了

    private GirlFriends(String name) {
        this.name = name;
    }

    // 3.提供公有的 getInstance()方法将实例化的对象返回出去，synchronized 实行同步代码块，线程安全

    public static synchronized GirlFriends getInstance() {
        if (girlFriends == null)
        {
            girlFriends = new GirlFriends("潮圆信寂");
        }
        return girlFriends;
    }

    @Override
    public String toString() {
        return "GirlFriends{" +
                "name='" + name + '\'' +
                '}';
    }
}