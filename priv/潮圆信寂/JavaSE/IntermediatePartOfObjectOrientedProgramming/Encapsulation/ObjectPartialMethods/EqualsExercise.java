package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.ObjectPartialMethods;
/**
 *
 *@author 潮圆信寂
 *@date 2022/8/23
 */
public class EqualsExercise {
    public static void main(String[] args) {
        //应用实例：判断两个Person对象的内容是否相等，如果两个Person对象的各个属性值都一样则返回true，否则返回false
        Person person1 = new Person("小明", 18, '男');
        Person person2 = new Person("小王", 21, '女');
        Person person3 = new Person("小明", 18, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        //以下为失误，应用实例真实要求为在Person类中重写equals()方法
//        String name1 = person1.getName();
//        String name2 = person2.getName();
//        String name3 = person3.getName();
//        int age1 = person1.getAge();
//        int age2 = person2.getAge();
//        int age3 = person3.getAge();
//        char gender1 = person1.getGender();
//        char gender2 = person2.getGender();
//        char gender3 = person3.getGender();
//        if (name1.equals(name2) && age1 == age2 && gender1 == gender2)
//        {
//            System.out.println(true);
//        }
//        else
//        {
//            System.out.println(false);
//        }
//        System.out.println();
//        if (name1.equals(name3) && age1 == age3 && gender1 == gender3)
//        {
//            System.out.println(true);
//        }
//        else
//        {
//            System.out.println(false);
//        }
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        else
        {
            if (obj instanceof Person)
            {
                Person per = ((Person) obj);
                return per.getAge() == this.age && per.name.equals(this.name) && per.gender == this.gender;
            }
        }
        return false;
    }
}