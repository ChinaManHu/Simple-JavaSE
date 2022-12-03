package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.ClassVariable;

/**
 *
 *@author 潮圆信寂
 *@date 2022/11/26
 */

public class ChildGame {
    public static void main(String[] args) {
        //一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在共有多少人在玩？
        //被注释部分的方法变量不被类的实例化对象所共有，调用不方便
        //视频P375部分的解法有误，通过实例化对象去引用静态变量是错误的！
        Child child1 = new Child("老六");
        Child child2 = new Child("老八秘制小汉堡");
        Child child3 = new Child("老九");
        child1.join();
        //counts++;
        child2.join();
        //counts++;
        child3.join();
        //counts++;
        //System.out.println("共有" + count + "个小孩加入了游戏！");
        System.out.println("共有" + Child.count + "个小孩加入了游戏！");
    }
}

class Child {
    private String name;

    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join()
    {
        System.out.println(this.name + "加入了游戏！！！");
    }
}