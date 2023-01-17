package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 20:37
 *
 */

/*
1.有一个交通工具接口类Vehicles,有work接口
2.有Horse类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
5.实例化Person对象“唐僧”,要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
 */

public class Exercise05 {
    public static void main(String[] args) {
        //此次测试思路是根据视频而来，个人觉得不太严谨
        // 这里的路按照视频的题目设想应该是已经被规划好的，或者说是只有这一条的，碰到普通的路骑马，碰到水路坐船
        //个人觉得可能会有另一种题目解读：交通工具是被规划好的，骑马就找普通路走，某条路上碰到水路就走其它的普通路，普通路可以理解为陆地
        //坐船的就找水路走，某条路碰到陆地就走其它方向的水路，不过现实生活中这一行可能不现实，上一行比较符合现实
        //猜想实现于Exercise0501.java，视频设想的解决办法应该是正确的，按照本人的这个猜想，那解决办法在现实逻辑上应该只算对了一半

        //new Horse()可以替换为new VehicleFactory().getHorse()，本质上都是将一个实现了Vehicles接口的类实例化后的对象作为参数
        Person person = new Person("唐僧", null);
        person.passCommonRoad();
        person.passRiver();

    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("马跑了");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("船开了");
    }
}

class VehicleFactory {
    public Horse getHorse() {
        return new Horse();
    }

    public Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.Vehicles = vehicles;
    }

    public void passRiver() {
        //这里的new VehicleFactory()可以替换为VehicleFactory，前提是将VehicleFactory类中的getBoat()改为静态
        Boat boat = new VehicleFactory().getBoat();
        boat.work();
    }

    public void passCommonRoad() {
        //原理同上
        Horse horse = new VehicleFactory().getHorse();
        horse.work();
    }
}