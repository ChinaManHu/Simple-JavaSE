package priv.潮圆信寂.JavaSE.MiddlePart.ObjectPartialMethods;

/**
 * @author 潮圆信寂
 * @date 2022/8/23
 */
public class FinalizeDetail {
    public static void main(String[] args) {
        //finalize()方法已在Object中被弃用，此次仅做了解
        //(1)当对象被回收时，系统自动调用该对象的 finalize方法。子类可以重写该方法，做一些释放资源的操作
        //(2)什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，
        //   就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用 finalize 方法。
        //(3)垃圾回收机制的调用，是由系统来决定(即有自己的GC算法),也可以通过System.gc()主动触发垃圾回收机制

        //这时plane对象就是一个垃圾,垃圾回收器就会回收(销毁)对象,在销毁对象前,会调用该对象的 finalize 方法
        //程序员就可以在 finalize中，写自己的业务逻辑代码(比如释放资源：数据库连接,或者打开文件...)
        //如果程序员不重写 finalize,那么就会调用Object类的finalize,即默认处理
        //如果程序员重写了 finalize, 就可以实现自己的逻辑
        Plane plane = new Plane("波音747");
        plane = null;

        //主动调用垃圾回收器
        //(提示：调用垃圾回收器不影响后面的代码执行，也可以理解为后面的代码可以和垃圾回收器同时运行)
        System.gc();

        System.out.println("程序运行结束！");
    }
}

class Plane {
    private String name;

    public Plane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("飞机已被销毁！");
        System.out.println("占用资源已被释放！");
    }
}