package priv.潮圆信寂.JavaSE.MiddlePart.Polymorphic;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/21
 */
public class PolymorphicArrayDemo {
    public static void main(String[] args) {
        //应用实例：创建一个Person对象，一个Student对象，一个Teacher对象。
        //统一放在数组中，并调用每个对象的say()方法
        //应用实例升级：在应用实例前提下，调用子类特有方法（Student中的study()方法，Teacher中的teach()方法）
        Person[] people = new Person[3];
        people[0] = new Person("smith", 12);
        people[1] = new Student("小明", 18, 99);
        people[2] = new Teacher("孙建明", 35, 20000);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].say());
            if (people[i] instanceof Student)
            {
                //向下转型
                ((Student)people[i]).study();
            }
            else if (people[i] instanceof Teacher)
            {
                //向下转型
                ((Teacher)people[i]).teach();
            }
            else if (people[i] instanceof Person) {
            }
            else
            {
                System.out.println("输入的类型有误！");
            }
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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

    public String say() {
        return "姓名：" + name + "\t年龄：" + age;
    }

}

class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.setSalary(salary);
        this.setAge(age);
        this.setName(name);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String say() {
        return "老师" + super.say() + "\t薪水：" + salary;
    }

    public void teach() {
        System.out.println("老师正在讲课！");
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.setAge(age);
        this.setName(name);
        this.setScore(score);
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "学生" + super.say() + "\t分数为：" + score;
    }

    public void study() {
        System.out.println("学正在学习！");
    }
}

