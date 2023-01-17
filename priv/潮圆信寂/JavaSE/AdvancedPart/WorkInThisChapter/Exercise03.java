package priv.潮圆信寂.JavaSE.AdvancedPart.WorkInThisChapter;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 20:35
 *
 */

/*
1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone,定义方法testWork测试计算功能，调用计算接口的work方法，
2.要求调用CellPhone对象的testWork方法，使用上匿名内部类
 */

public class Exercise03 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();

        //(参数列表) -> (方法体)
        cellphone.testWork(() -> System.out.println("计算完成！ (注：匿名内部类的lambda写法)"));

        //接口/父类类型 引用变量名= new 接口/父类类型() {方法的重写};
        cellphone.testWork(new Computer() {
            @Override
            public void work() {
                System.out.println("计算完成！ (注：匿名内部类的常规写法)");
            }
        });
        cellphone.testWork(cellphone.computer);
    }
}

interface Computer {
    void work();
}

class Cellphone {
    public void testWork(Computer computer) {
        computer.work();
    }

    //此方法是为适应主方法中的第三种实现方法

    Computer computer = new Computer() {
        @Override
        public void work() {
            System.out.println("计算完成！");
        }
    };
}
