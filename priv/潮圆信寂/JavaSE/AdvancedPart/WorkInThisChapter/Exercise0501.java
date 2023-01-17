package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2023/1/14 17:09
 *
 */

/*
1.有一个交通工具接口类Vehicles,有work接口
2.有Horse类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
5.实例化Person对象“唐僧”,要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
 */

public class Exercise0501 {
    public static void main(String[] args) {
        //这样的解法目前看有三大弊端或者说是不合理之处
        //首先：一个人到达随意位置的话单凭一种交通工具是不现实的
        //其次：在标有***的注释处的VehicleFactory01().getBoat01()和VehicleFactory01().getHorse01()的使用比较牵强
        //     会让题目的第三点解题要求看起来比较多余
        //最后：本人的思路提出有很大部分上是想根据Person01在实例化对象的第二个参数作为区分交通工具类型的依据
        //     这样根据第二个参数的不同就可以区分出所使用的交通工具的类型，从而调用不同交通工具的特有方法，不过根据实践
        //     这样的思想还是太想当然了，因为Person01和Boat01/Horse01并无继承关系，无法做到直接的向下类型强制转换
        Person01 person01 = new Person01("唐僧", new Horse01());
        Person01 person02 = new Person01("潮圆信寂", new Boat01());
        Person01[] person01Arr = new Person01[2];
        person01Arr[0] = person01;
        person01Arr[1] = person02;
        for (int i = 0; i < person01Arr.length; i++) {
            if (person01Arr[i].getVehicles01() instanceof Horse01)
            {
                Horse01 vehicles01 = (Horse01) person01Arr[i].getVehicles01();
                vehicles01.passCommonRoad01();
            }
            else if (person01Arr[i].getVehicles01() instanceof Boat01)
            {
                Boat01 vehicles02 = (Boat01) person01Arr[i].getVehicles01();
                vehicles02.passRiver01();
            }
            else
            {
                System.out.println("Error!!!");
            }
        }
    }
}
interface Vehicles01 {
    public void work01();
}

class Horse01 implements Vehicles01 {
    @Override
    public void work01() {
        System.out.println("马在陆地上跑！");
    }
    public void passCommonRoad01() {
        //***
        Horse01 horse01 = new VehicleFactory01().getHorse01();
        horse01.work01();
    }
}

class Boat01 implements Vehicles01 {
    @Override
    public void work01() {
        System.out.println("船在水上开！");
    }
    public void passRiver01() {
        //***
        Boat01 boat01 = new VehicleFactory01().getBoat01();
        boat01.work01();
    }
}

class VehicleFactory01 {
    public Horse01 getHorse01() {
        return new Horse01();
    }

    public Boat01 getBoat01() {
        return new Boat01();
    }
}

class Person01 {
    private String name01;
    private Vehicles01 Vehicles01;

    public Person01(String name01, Vehicles01 vehicles01) {
        this.name01 = name01;
        this.Vehicles01 = vehicles01;
    }

    public String getName01() {
        return name01;
    }

    public void setName01(String name01) {
        this.name01 = name01;
    }

    public Vehicles01 getVehicles01() {
        return Vehicles01;
    }

    public void setVehicles01(Vehicles01 vehicles01) {
        this.Vehicles01 = vehicles01;
    }
}