package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/28
 */
public class Exercise01 {
    public static void main(String[] args) {
        //定义一个Person类{name, age, job},初始化Person对象数组，有7个Person对象，并按照age从大到小进行排序（冒泡排序）

        Person person1 = new Person("小徐", 18,"Python程序员");
        Person person2 = new Person("小朱", 21,"Java程序员");
        Person person3 = new Person("小陈", 19,"C++程序员");
        Person person4 = new Person("小胡", 119,"CV程序员");
        Person person5 = new Person("小李", 34,"PHP程序员");
        Person person6 = new Person("小张", 24,"JS程序员");
        Person person7 = new Person("小海", 6,"HTML程序员");
        Person[] person = new Person[7];
        person[0] = person1;
        person[1] = person2;
        person[2] = person3;
        person[3] = person4;
        person[4] = person5;
        person[5] = person6;
        person[6] = person7;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].getAge() < person[j + 1].getAge())
                {
                    Person temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}