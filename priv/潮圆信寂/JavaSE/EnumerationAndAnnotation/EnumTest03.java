package priv.潮圆信寂.JavaSE.EnumerationAndAnnotation;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/27 14:44
 *
 */


public class EnumTest03 {
    public static void main(String[] args) {
        Week[] days = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week day : days)
        {
            System.out.println(day);
        }
    }
}

enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),
    FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}