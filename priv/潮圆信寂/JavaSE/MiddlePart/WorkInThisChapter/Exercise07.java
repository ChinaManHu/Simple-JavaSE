package priv.潮圆信寂.JavaSE.MiddlePart.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/29
 */
public class Exercise07 {
    public static void main(String[] args) {
//        编写Doctor类{name, age, job, gender, sal}相应的getter()和setter()方法，5个参数的构造器
//        重写父类的equals(方法: public boolean equals(Object obj)
//        并判断测试类中创建的两个对象是否相等,相等就是判断属性是否相同
        Doctor doctor1 = new Doctor("Hqt1", 21, "医生", '男', 666666);
        Doctor doctor2 = new Doctor("Hqt1", 21, "医生", '男', 666666);
        System.out.println(doctor1.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (this instanceof Doctor && obj instanceof Doctor)
        {
            return this.name == ((Doctor) obj).name && this.job == ((Doctor)obj).job &&
                    this.sal == ((Doctor)obj).sal && this.gender == ((Doctor)obj).gender &&
                    this.age == ((Doctor)obj).age;
        }
        else
        {
            return false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}