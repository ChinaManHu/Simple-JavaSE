package priv.潮圆信寂.JavaSE.EnumerationAndAnnotation;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/26 18:09
 *
 */


public class EnumCommonMethod {
    public static void main(String[] args) {
        SeasonTest seasonTest01 = SeasonTest.SPRING;
        SeasonTest seasonTest02 = SeasonTest.AUTUMN;
        //name()输出枚举对象名字
        System.out.println(seasonTest01.name());
        //ordinal()输出该枚举对象的次序(编号),(注：枚举对象的次序从0开始)
        //枚举对象时第一个，所以输出0
        System.out.println(seasonTest01.ordinal());
        //枚举对象时第二个，所以输出1
        System.out.println(seasonTest02.ordinal());
        //values()含有所有定义的枚举对象
        SeasonTest[] values = SeasonTest.values();
        for (SeasonTest seasonTest: values) {
            System.out.println(seasonTest);
        }
        //valueOf()将字符串转换成已有的枚举对象，字符串需与某个枚举对象的常量名相同，否则报错。
        //简单来讲就是将字符串和所有的枚举对象常量名进行匹配，相同则可以创建新的引用进行使用。
        SeasonTest test = SeasonTest.valueOf("AUTUMN");
        System.out.println(test);
        //compareTo()比较枚举对象的编号
        //以枚举对象_1.compareTo(枚举对象_2)为例：输出的结果为：枚举对象_1的编号-枚举对象_2的编号，结果为0时说明比较的两个枚举对象相同
        System.out.println(SeasonTest.AUTUMN.compareTo(SeasonTest.SPRING));
        System.out.println(SeasonTest.AUTUMN.compareTo(SeasonTest.AUTUMN));
    }
}

enum SeasonTest {
    SPRING("Spring!!!", "春天来了"),AUTUMN;
    private String name;
    private String describe;

    SeasonTest(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    SeasonTest() {

    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

}