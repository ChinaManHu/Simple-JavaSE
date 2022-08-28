package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/28
 */
public class Exercise02 {
    public static void main(String[] args) {
//        (1)编写老师类，要求有属性"姓名name"，"年龄age"，"职称post"，”基本工资salary"
//        (2)编写业务方法，introduce() ,实现输出一个教师的信息。
//        (3)编写教师类的三个子类:教授类、副教授类、讲师类。工资级别分别为:教授为1.3、副
//           教授为1.2、讲师类1.1。 在三个子类里面都重写父类的introduce()方法。
//        (4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印.
        Teacher teacher = new Teacher("张愚", 28, "初级", 30000);
        teacher.introduce();
        System.out.println();
        Lecturer lecturer = new Lecturer("张永选", 30, "高级", 100000);
        lecturer.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary)
    {
        this.age = age;
        this.name = name;
        this.post = post;
        this.salary = salary;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("name = " + name + "\nage = " + age + "\npost = " + post + "\nsalary = " + salary);
    }
}

class Lecturer extends Teacher {
    public Lecturer(String name, int gae, String post, double salary) {
        super(name, gae, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("lecturerName = " + this.getName() + "\nlecturerAge = " + this.getAge() + "\nlecturerPost = " + this.getPost() + "\nlecturerSalary = " + this.getSalary());
    }
}

class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int gae, String post, double salary) {
        super(name, gae, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("associateProfessorName = " + this.getName() + "\nassociateProfessorAge = " + this.getAge() + "\nassociateProfessorPost = " + this.getPost() + "\nassociateProfessorSalary = " + this.getSalary());
    }
}

class Professor extends Teacher {
    public Professor(String name, int gae, String post, double salary) {
        super(name, gae, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("professorName = " + this.getName() + "\nprofessorAge = " + this.getAge() + "\nprofessorPost = " + this.getPost() + "\nprofessorSalary = " + this.getSalary());
    }
}