package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Extends;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/18
 */
public class OverrideExercise {
    public static void main(String[] args) {
//        编写一个PersonNine类，包括属性/private (name、 age),构造器,方法say(返回自我介绍的宇符串)
//        编写一个Student类，继承Person类，增加id、score属性/private, 以及构造器，定义say方法(返回自我介绍的信息)。
//        在main中，分别创建Person和Student对象，调用say方法输出自我介绍。
        PersonNine personNine = new PersonNine();
        StudentNine studentNine = new StudentNine();
        personNine.setName("person");
        personNine.setAge(188);
        studentNine.setName("student");
        studentNine.setAge(18);
        studentNine.setId(2020764109);
        studentNine.setScore(99);
        String strOfPersonNine = personNine.say();
        String strOfStudentNine = studentNine.say();
        System.out.println(strOfPersonNine);
        System.out.println(strOfStudentNine);
    }
}

class PersonNine {
    private String name;
    private int age;

    public PersonNine() {
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
        String strOfSpeak = "name = " + this.name + "\tage = " + this.age;
        return strOfSpeak;
    }
}

class StudentNine extends PersonNine {
    private int id;
    private double score;

    public StudentNine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        String strOfSpeak = "name = " + this.getName() + "\tage = " + this.getAge() + "\tid = " + this.id + "\tscore = " + this.score;
        return strOfSpeak;
    }
}