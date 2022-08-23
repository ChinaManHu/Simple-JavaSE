package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Extends;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/18
 */
public class ExtendsExercise {
    public static void main(String[] args) {
//        (1)编写Computer类，包含CPU、重量、硬盘等属性，getDetails方法用于返回Computer的详细信息
//        (2)编写PC子类，继承Computer类，添加特有属性[品牌brand]
//        (3)编写NotePad子类，继承Computer类，添加特有属性[演示color]
//        (4)编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值
//        以及从Computer类继承的属性赋值，并使用方法并打印输出信息
        PersonComputer personComputer = new PersonComputer("i9-3090", 2, "16GB", "联想小新Pro13");
        NotePad notePad = new NotePad("i7-3060", 1, "8GB", "银白色");
        notePad.info();
        System.out.println();
        personComputer.info();
    }
}

class Computer {
    String CPU;
    double weight;
    String disks;

    Computer(String cpu, double weight, String disks)
    {
        this.CPU = cpu;
        this.weight = weight;
        this.disks = disks;
    }

    public void getDetails() {
        System.out.println("电脑的CPU型号为：" + this.CPU);
        System.out.println("电脑的重量大小为(kg)：" + this.weight);
        System.out.println("电脑的硬盘为：" + this.disks);
    }
}

class PersonComputer extends Computer {
    String brand;

    PersonComputer(String cpu, double weight, String disks, String brand) {
        super(cpu, weight, disks);
        this.brand = brand;
    }
    public void info() {
        getDetails();
        System.out.println("电脑的品牌为：" + this.brand);
    }
}

class NotePad extends Computer{
    String color;

    NotePad(String cpu, double weight, String disks, String color) {
        super(cpu, weight, disks);
        this.color = color;
    }
    public void info() {
        getDetails();
        System.out.println("电脑的颜色为：" + this.color);
    }
}