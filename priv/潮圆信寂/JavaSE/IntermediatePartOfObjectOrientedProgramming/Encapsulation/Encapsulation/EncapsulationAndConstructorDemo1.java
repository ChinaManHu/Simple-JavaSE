package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Encapsulation;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/15
 */
public class EncapsulationAndConstructorDemo1 {
    public static void main(String[] args) {
        //封装和构造器的简单应用
        //要求：利用封装对于工作人员的年龄和姓名进行合理的验证
        PersonSeven personSeven1 = new PersonSeven();
        personSeven1.setName("潮圆信寂");
        personSeven1.setAge(21);
        personSeven1.setSalary(666666);
        personSeven1.info();
        System.out.println();
        PersonSeven personSeven2 = new PersonSeven("昊天77777", 128, 10000);
        personSeven2.info();
    }
}

class PersonSeven {
    public String name;

    //设置成私有属性，避免在其它类中被直接调用

    private int age;
    private double salary;

    public PersonSeven(String name, int age, double salary) {

//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//在构造器中调用封装的方法，避免创建对象时封装的方法被避开

        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
    }

    public PersonSeven() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }
        else {
            System.out.println("您输入的姓名不正确！！！（已改为默认值）");
            this.name = "至尊道场大师兄";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 119) {
            this.age = age;
        }
        else {
            System.out.println("您输入的年龄不正确！！！（已改为默认值）");
            this.age = 18;
        }
    }

    public void info(){
        System.out.print("姓名为：" + name + "\t年龄为：" + age + "\t薪水为：" + salary);
    }
}