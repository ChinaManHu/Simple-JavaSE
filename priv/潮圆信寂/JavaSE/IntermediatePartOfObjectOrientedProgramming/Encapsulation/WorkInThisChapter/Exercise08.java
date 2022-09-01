package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/29
 */
public class Exercise08 {
    public static void main(String[] args) {
//        打印效果如下
//        老师的信息:                       学生的信息:
//        姓名:王飞                         姓名:小明
//        年龄: 30                         年龄: 15
//        性别:男                          性别:男
//        工龄: 5                         学号: 00023102
//        我承诺，我会认真教课。             我承诺，我会好好学习。
//        王飞爱玩象棋                     小明爱玩足球。

//        (1)做一个Student类，Student类有名称 (name)，性别(sex),年龄(age)，学号(stu_id)
//        做合理封装，通过构造器在创建对象时将4个属性赋值。
//        (2)写一个Teacher类，Teacher类有名称(name) ，性别(sex) ，年龄(age) ，工龄(work_age)
//        做合理封装，通过构造器在创建对象时将4个属性赋值。
//        (3)抽取一个父类Person类，将共同属性和方法放到Person类
//        (4)学生需要有学习的方法(study) ，在方法里写生“我承诺，我会好好学习。”。
//        (5)教师需要有教学的方法(teach) ，在方法里写上“我承诺，我会认真教学。
//        (6)学生和教师都有玩的方法(play) ，学会玩的是足球，老师玩的是象棋
//        此方法是返回字符串的分别返回"xx爱玩足球”和"xx爱玩象棋"
//        (其中xx分别代表学生和老师的姓名)。因为玩的方法名称都一样，所以要求此方法定义在父类中，子类实现重写。
//        (7)定义多态数组，里面保存2个学生和2个教师，要求按年龄从高到低排序，
//        (8)定义方法，形参为Person类型，功能:调用学生的study或教师的teach方法
        People people1 = new People("胡昊天", 21, '男');
        Teachers teacher1 = new Teachers("老王", 25, '男', 4);
        Teachers teacher2 = new Teachers("老孙", 24, '女', 5);
        Students student1 = new Students("小陈", 18, '男', 2020764110);
        Students student2 = new Students("小朱", 19, '男', 2020764108);
        People[] people = new People[4];
        people[0] = teacher1;
        people[1] = teacher2;
        people[2] = student1;
        people[3] = student2;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[i].getAge() < people[i + 1].getAge())
                {
                    People temp;
                    temp = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Teachers)
            {
                System.out.println(((Teachers)people[i]).toString());
            }
            else if (people[i] instanceof Students)
            {
                System.out.println(((Students)people[i]).toString());
            }
            else
            {
                System.out.println("类型出错！！！");
            }
        }
        people1.work(student1);
        people1.work(teacher1);
    }
}

class People {
    private String name;
    private char sex;
    private int age;

    public People(String name, int age, char sex) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void work(People people) {
        if (people instanceof Teachers)
        {
            ((Teachers)people).teach();
        }
        else if (people instanceof Students)
        {
            ((Students)people).study();
        }
        else
        {
            System.out.println("类型错误！");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void play() {
        System.out.println("人类喜欢玩小猫咪！！！");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

class Teachers extends People{
    private int work_age;

    public Teachers(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学！！！");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + "喜欢玩象棋！！！");
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Teachers{" +
                "work_age=" + work_age +
                '}';
    }
}

class Students extends People{
    private int stu_id;

    public Students(String name, int age, char sex, int stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习！！！");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + "喜欢玩足球！！！");
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "Students{" +
                "stu_id=" + stu_id +
                '}';
    }
}