package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Polymorphic;

/**
 * @author 潮圆信寂
 * @date 2022/8/21
 */
public class DynamicBindingMechanismDetail {
    public static void main(String[] args) {
//         java的动态绑定机制
//        （1）当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
//        （2）当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
        Aaa aba = new Bbb();

        //直接调用运行类型的方法
        System.out.println(aba.getI());

        //在运行类型中查找到getI方法后直接调用
        System.out.println(aba.sum2());

        //只注释掉子类的i属性时，查找父类，找到后直接返回值
        System.out.println(aba.getI());

        //只注释掉子类的方法sum1时，查找父类，找到后调用
        // 注意：此时的属性值遵循开头第二点，因为使用的是父类中的方法，此时执行到父类中，所以此时的i为父类中的属性
        System.out.println(aba.sum1());

        //只注释掉子类的sum2方法时，查找父类，找到后调用
        //调用父类中的sum2方法时，父类中的sum2方法是和运行类型动态绑定的，所以sum2中调用的getI方法是子类的，也就是运行类型的
        //此时执行到子类的getI方法中，所以此时的i为子类中的属性
        System.out.println(aba.sum2());
    }
}

class Aaa {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }

    public int sum2() {
        return getI() + 10;
    }
}

class Bbb extends Aaa {
    public int i = 20;

    @Override
    public int getI() {
        return i;
    }

    @Override
    public int sum1() {
        return i + 20;
    }

//    @Override
//    public int sum2() {
//        return getI() + 20;
//    }
}