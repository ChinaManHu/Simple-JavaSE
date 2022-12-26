package priv.潮圆信寂.JavaSE.BasicPart.Method.This;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/13
 */
public class ThisDemo {
    public static void main(String[] args) {
        //定义PersonSeven类，里面有name、age属性并提供compareTo比较方法，用于判断是否和另一个人相等
        //名字和年龄完全一样，就返回true,否则返回false
        PersonSeven personSeven1 = new PersonSeven("潮圆信寂", 88);
        PersonSeven personSeven2 = new PersonSeven("昊天", 99);
        PersonSeven personSeven3 = new PersonSeven("昊天", 99);
        System.out.println(personSeven1.compareTo(personSeven2));
        System.out.println(personSeven2.compareTo(personSeven3));
    }
}

class PersonSeven {
    String name;
    int age;
    public PersonSeven(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(PersonSeven person1)
    {
        return this.name.equals(person1.name) && this.age == person1.age;
    }
}