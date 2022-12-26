package priv.潮圆信寂.JavaSE.MiddlePart.ObjectPartialMethods;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/23
 */
public class ToStringDemo {
    public static void main(String[] args) {
//        默认返回:全类名+ @ +哈希值的十六进制，[查看Object的toString方法]
//        子类往往重写toString方法，用于返回对象的属性信息
//        重写toString方法，打印对象或拼接对象时，都会自动调用该对象的toString形式
//        当直接输出一个对象时，toString 方法会被默认的调用
        Human human = new Human("小妖怪", 999);
        System.out.println(human.toString());
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}