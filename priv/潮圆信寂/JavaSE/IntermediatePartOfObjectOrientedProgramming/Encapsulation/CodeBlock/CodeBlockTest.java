package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.CodeBlock;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/1 20:38
 *
 */


public class CodeBlockTest {
    public static void main(String[] args) {
        //基于CodeBlockDetail01和CodeBlockDetail02理解的测试代码
        Cat cat = new Cat();
    }
}

//biology(生物)

class Biology {
    // 9
    public Biology() {
        System.out.println("Biology的无参构造函数");
    }

    // 7.1
    private String livingHome = getLivingHome();

    // 8
    {
        System.out.println("Biology的普通代码块");
    }

    // 7.2
    public String getLivingHome() {
        return "海洋";
    }

    // 1.1
    private static String biologySize = getBiologySize();

    // 2
    static {
        System.out.println("Biology的静态代码块");
    }

    // 1.2
    public static String getBiologySize() {
        System.out.println("Biology的静态方法被调用");
        return "normal";
    }

    public static void showBiologySize() {
        System.out.println(biologySize);
    }
}

class Animal extends Biology{
    // 12
    public Animal() {
        System.out.println("Animal的无参构造函数");
    }

    // 10
    {
        System.out.println("Animal的普通代码块");
    }

    // 11.1
    private String walkWays = getWalkWays();

    // 11.2
    public String getWalkWays() {
        return "动物的行走方式";
    }

    // 3
    static {
        System.out.println("Animal的静态代码块");
    }

    // 4
    private static String runningWays = getRunningWays();

    // 4.1
    public static String getRunningWays() {
        System.out.println("Animal的静态方法被调用");
        return "动物的奔跑方式";
    }

    public static void showRunningWays() {
        System.out.println(runningWays);
    }
}

class Cat extends Animal{
    // 15
    public Cat() {
        System.out.println("Cat的无参构造函数");
    }

    // 13
    {
        System.out.println("Cat的普通代码块");
    }

    // 14.1
    private String food = getFood();

    // 14.2
    public String getFood() {
        return "鱼";
    }

    // 5
    static {
        System.out.println("Cat的静态代码块");
    }

    // 6.1
    private static String lifeTime = getLifeTime();

    //6.2
    public static String getLifeTime() {
        System.out.println("Cat的静态方法被调用");
        return "20年";
    }

    public static void showLifeTime() {
        System.out.println(lifeTime);
    }
}