package priv.潮圆信寂.JavaSE.EnumerationAndAnnotation;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/25 12:15
 *
 */

public class CustomizeEnumTest01 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
    }
}

class Season {
//    1. 将构造器私有化,目的防止 直接 new
//    2. 去掉 setXxx 方法, 防止属性被修改
//    3. 在 Season 内部，直接创建固定的对象
//    4. 优化，可以加入 final 修饰符

    private String name;
    private String describe;

    private Season(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public final static Season SPRING = new Season("Spring", "春天");
    public final static Season SUMMER = new Season("Summer", "夏天");
    public final static Season AUTUMN = new Season("Autumn", "秋天");
    public final static Season WINTER = new Season("Winter", "冬天");

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}