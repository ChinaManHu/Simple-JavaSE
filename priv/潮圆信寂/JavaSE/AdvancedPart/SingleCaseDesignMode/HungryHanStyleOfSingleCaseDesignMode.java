package priv.潮圆信寂.JavaSE.AdvancedPart.SingleCaseDesignMode;

/**
 * @author 潮圆信寂
 * @date 2022/12/2 13:21
 */


public class HungryHanStyleOfSingleCaseDesignMode {
    //    所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，
    //    并且该类只提供一个取得其对象实例的方法

    public static void main(String[] args) {
        GirlFriend girlFriend01 = GirlFriend.getInstance();
        GirlFriend girlFriend02 = GirlFriend.getInstance();
        System.out.println(girlFriend01.toString());
        System.out.println(girlFriend02.toString());
        if (girlFriend01 == girlFriend02)
        {
            System.out.println("同一个对象");
        }
    }
}

//  饿汉式
//  步骤:(1)构造器私有化--->防止直接new    (2)类的内部创建对象    (3)向外暴露一个静态的公共方法。如:getInstance()

class GirlFriend {
    private String name;

    // 1.类内创建一个私有的，静态的类类型的对象
    // 目的：
    // 首先防止外部通过使用 GirlFriend.girlFriend = null; 也避免内部修改，直接将对象报废（private，final）
    // 其次是为了在类内部实例化一个对象，提升为类层级，外部便于使用静态方法返回当前对象，因为静态方法只能调用静态内容（static）
    // 饿汉式：
    // 一上来就实例化一个对象，当外部调用 getInstance()方法时直接将对象返回出去

    private final static GirlFriend girlFriend = new GirlFriend("潮圆信寂");

    // 2.私有化构造方法
    // 目的：
    // 只允许在类内实例化对象，如果可以在类外实例化对象，那么对象的数量就无法保证了

    private GirlFriend(String name) {
        this.name = name;
    }

    // 3.提供公有的 getInstance()方法将实例化的对象返回出去

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
