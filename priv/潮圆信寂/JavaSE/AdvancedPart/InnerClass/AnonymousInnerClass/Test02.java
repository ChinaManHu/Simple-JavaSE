package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.AnonymousInnerClass;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/6 10:12
 *
 */


public class Test02 {
    public static void main(String[] args) {
//        有一个铃声接口Bell,里面有个ring方法。有一个手机类Cellphone,具有闹钟功能alarmClock,参数是Bell类型，
//        测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印:懒猪起床了,再传入另一个暨名内部类(对象)，打印:小伙伴上课了
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了...");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了...");
            }
        });
    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}