package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 20:39
 *
 */

/*
内部类练习
有一个Car类，有属性temperature (温度) ，车内有Air (空调)类，有吹风的功能flow,
Air会监视车内的温度，如果温度超过40度则吹冷气。如果温度低于0度则吹暖气，如果在这之
间则关掉空调。实例化具有不同温度的Car对象，调用空调的flow方法，测试空调吹的风是否正确.
 */

public class Exercise06 {
    public static void main(String[] args) {
        Car car01 = new Car(50);
        Car car02 = new Car(40);
        Car car03 = new Car(0);
        Car car04 = new Car(-10);
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
        Air air = new Air();
        air.flow();
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷风");
            }
            else if (temperature < 0) {
                System.out.println("吹暖风");
            }
            else
            {
                System.out.println("关闭空调");
            }
        }
    }
}