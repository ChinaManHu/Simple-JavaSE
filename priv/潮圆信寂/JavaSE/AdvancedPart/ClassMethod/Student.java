package priv.潮圆信寂.JavaSE.AdvancedPart.ClassMethod;

/**
 *
 * @author 潮圆信寂
 * @date 2022/11/30 18:55
 *
 */




public class Student {
    int age = 19;
    public void getAge()
    {
        System.out.println("hhh");
    }
    Student student1 = new Student();
    public static void main(String[] args) {
        //java在main函数中实例化本类java main方法调用类的实例化方法疑问
        //解惑：首先，static中可以创建实例，但不能访问本类的某个已有实例(除非传递进来的),
        // 其次静态方法是不能调用非静态方法和属性，前提是不能调用没有确定实例化对象的非静态方法和属性，
        // 而new Example()并不是一个单纯的非静态方法，它是在构建一个类对象及其初始化对象，返回的是一个对象实例，
        // 相当于调用的是一个以构建好的实例化对象。对象都确定了，非静态方法当然可以使用了
        // (静态方法和静态属性是类中所有对象所共有的！所以是类直接调用的)。
        /*
        参考网址：https://blog.csdn.net/weixin_39677203/article/details/114758486?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166980755516800182742797%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=166980755516800182742797&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_ecpm_v1~rank_v31_ecpm-2-114758486-null-null.142^v67^control,201^v3^control_1,213^v2^t3_esquery_v2&utm_term=%E4%B8%BA%E4%BB%80%E4%B9%88%E5%9C%A8%E4%B8%BB%E6%96%B9%E6%B3%95%E4%B8%AD%E5%8F%AF%E4%BB%A5%E8%AE%BF%E9%97%AE%E4%B8%BB%E7%B1%BB%E7%9A%84%E5%AE%9E%E4%BE%8B%E5%AF%B9%E8%B1%A1&spm=1018.2226.3001.4187
         */
        StudentFee studentFeeOne = new StudentFee("张三");
        StudentFee studentFeeTwo = new StudentFee("李四");
        studentFeeOne.fee += 1688;
        studentFeeTwo.fee += 2000;
        studentFeeOne.showFee();
        studentFeeTwo.showFee();
        Student student = new Student();
        student.getAge();
        System.out.println(student.age);
        System.out.println();
    }
}

class StudentFee {
    public static Integer fee = 0;
    public  String name;

    public StudentFee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void showFee() {
        System.out.println("所有学生的总学费为：" + StudentFee.fee);
    }
}
