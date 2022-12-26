package priv.潮圆信寂.JavaSE.BasicPart.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/7
 */
public class MethodTransmissionMechanismDetail3 {
    public static void main(String[] args) {
        PersonThree person1 = new PersonThree();
        person1.name = "小明";
        person1.age = 18;
        System.out.println("共用堆中地址改变值之前main方法中age的值为：" + person1.age);
        PersonFour personFour = new PersonFour();
        personFour.changeAge(person1);
        System.out.println("共用堆中地址改变值后前main方法中age的值为：" + person1.age);
    }
}

class PersonThree {
    String name;
    int age;
}

class PersonFour {
    public void changeAge(PersonThree person2) {
        person2.age = 21;
        System.out.println("调用changeAge方法后的age值为：" + person2.age);
    }
}