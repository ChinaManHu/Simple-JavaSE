package priv.潮圆信寂.JavaSE.EnumerationAndAnnotation;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/26 18:09
 *
 */


public class EnumTest02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
    }
}

enum Season02 {

    SPRING("Spring！！！", "春天"), SUMMER("Summer", "夏天");

    private String name;
    private String describe;

    private Season02(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
