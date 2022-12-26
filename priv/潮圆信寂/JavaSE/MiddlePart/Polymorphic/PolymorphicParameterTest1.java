package priv.潮圆信寂.JavaSE.MiddlePart.Polymorphic;

/**
 * @author 潮圆信寂
 * @date 2022/8/19
 */
public class PolymorphicParameterTest1 {
    public static void main(String[] args) {
        Cat01 cat = new Cat01();
        cat.setName("猫");
        Dog01 dog = new Dog01();
        dog.setName("狗");
        Fish01 fish = new Fish01();
        fish.setName("鱼");
        Bone01 bone = new Bone01();
        bone.setName("骨头");
        Master01 master = new Master01();
        master.setName("主任");
        master.feed(cat, fish);
        master.feed(dog, bone);
    }
}

class Master01 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    用父类对象作为参数，代替多种子类，实现方法和对象的多态
//    public void feed(Dog01 dog, Bone01 bone) {
//        this.name = name;
//        System.out.println(this.name + "给" + dog.getName() + "吃" + bone.getName());
//    }
//
//    public void feed(Cat01 cat, Fish01 fish) {
//        this.name = name;
//        System.out.println(this.name + "给" + cat.getName() + "吃" + fish.getName());
//    }

    public void feed(Master01 master, Food01 food) {
        this.name = name;
        System.out.println(this.name + "给" + master.getName() + "吃" + food.getName());
    }
}

//此处继承关系不符合常理，只做简单测试

class Animal01 extends Master01 {

}

class Cat01 extends Animal01 {

}

class Dog01 extends Animal01 {

}

class Food01 extends Master01 {

}

class Fish01 extends Food01 {

}

class Bone01 extends Food01 {

}