package priv.潮圆信寂.JavaSE.AdvancedPart.CodeBlock;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/1 18:50
 *
 */


public class CodeBlockDetail01 {
    public static void main(String[] args) {
//        非静态和静态代码块及构造器的执行顺序的简单实验
//        个人理解：代码块是一种对于构造器的补充，当同一个类的不同构造器中有相同语句时，为提高效率，取构造器的共同语句组成代码块。
//                程序运行观察可得，静态代码块只执行一次，而非静态代码块执行的次数与对象创建的次数有关
//                (简而言之：静态代码块在类加载时执行，且只执行一次。非静态代码块在创建对象时调用，创建一次，调用一次)
//        static代码块执行次数为一的原因：static代码块只在类加载时执行，类是用类加载器来读取的，类加载器是带有
//        一个缓存区的，它会把读取到的类缓存起来，所以在一次虚拟机运行期间，一个类只会被加载一次，这样的话静态代码块只会运行一次。

//        类加载的三种情况：(1):创建实例化对象的时候(new)    (2):创建子类实例化对象时，父类也会被加载
//                      (3):使用类的静态成员时(静态变量，静态方法)    (4):子类使用静态成员的时候，父类的静态代码块也会执行

//        子类和父类的加载问题：
//        先加载main方法对应的类，执行main方法类的静态代码块。
//        创建一个对象，先类加载器加载父类，然后加载子类。
//        对应的就是先执行父类的静态代码块，再执行子类的静态代码块。
//        然后创建父类对象，对应的就是执行父类的非静态代码块，再执行父类的构造函数。
//        最后再执行子类的非静态代码块，再执行子类的构造方法。
//        https://blog.csdn.net/weixin_43975276/article/details/115261361
        Movie movie1 = new Movie("忠犬八公");
        System.out.println("===============================");
        Movie movie2 = new Movie("犬夜叉剧场版", 1688);
        System.out.println("===============================");
        Movie movie3 = new Movie("名侦探柯南剧场版", 688, "北京红星电影院");
//        创建实例化对象的时候(new)
//        Aa aa = new Aa();
//        创建子类实例化对象时，父类也会被加载
//        Bb bb = new Bb();
//        使用类的静态成员时(静态变量，静态方法)    (注：当只使用类的静态成员时，非静态的代码块不会被执行)
//        Aa.show();
//        子类使用静态成员的时候，父类的静态代码块也会执行
//        Bb.show();

    }
}

class Movie {
    private String name;
    private double price;
    private String director;
    static {
        System.out.println("静态代码块");
    }

    public Movie(String name) {
//        System.out.println("电影开始了！");
//        System.out.println("电影正在放映中！");
//        System.out.println("电影结束了！");
        this.name = name;
        System.out.println("Movie(String name)方法被调用！");
    }

    public Movie(String name, double price) {
//        System.out.println("电影开始了！");
//        System.out.println("电影正在放映中！");
//        System.out.println("电影结束了！");
        this.name = name;
        this.price = price;
        System.out.println("Movie(String name, double price)方法被调用！");
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影开始了！");
//        System.out.println("电影正在放映中！");
//        System.out.println("电影结束了！");
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("Movie(String name, double price, String director)方法被调用！");
    }

    {
        System.out.println("非静态代码块");
        System.out.println("电影开始了！");
        System.out.println("电影正在放映中！");
        System.out.println("电影结束了！");
    }
}

class Aa {
    static {
        System.out.println("Aa的静态代码块");
    }

    {
        System.out.println("Aa的非静态代码块");
    }
    public static String name = "Aa的静态变量";

    public static void show() {
        System.out.println("Aa类的静态方法");
    }
}

class Bb extends Aa {
    static {
        System.out.println("Bb的静态代码块");
    }
    public static String name = "Bb的静态变量";

    public static void show() {
        System.out.println("Bb类的静态方法");
    }
}