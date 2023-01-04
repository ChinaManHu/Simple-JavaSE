package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.AnonymousInnerClass;

/**
 *
 * @author 潮圆信寂
 * @date 2023/1/4 14:40
 *
 */


public class DetailedPersonalOpinions {
    /*
    个人对于匿名内部类的一些见解和使用区分实践
    匿名内部类主要实现方法主要可以区分为两类，(1)常规写法 (2)lambda写法（Java8之后的特性）

    常规写法又可细分为两种(本质一样)
    一种是和package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.AnonymousInnerClass.Test01中的注释代码一样：
    接口/父类类型 引用变量名 = new 接口/父类类型(){方法的重写}; ，最后的呈现结果以引用变量名为代替
    一种是和package priv.潮圆信寂.JavaSE.AdvancedPart.InnerClass.AnonymousInnerClass.Test02中的代码一样，
    直接 new 接口/父类类型() {方法的重写}; ，使用时应该只能一次性使用
    两者优劣：前一种创建了引用变量名，可以再一定程度上多次使用，但代码的简洁性缺少了一点
            后一种使用时可能更加方便简洁，也更符合匿名内部类的特性，真正做到了使用的一次性

    lambda写法：(匿名内部类被重写方法的形参列表) -> {被重写方法的方法体代码}    注：-> 是语法形式，无实际含义
    注意：Lambda表达式只能简化函数式接口的匿名内部类的写法形式(函数式接口:必须是接口的匿名内部类，接口中只能有一个抽象方法)
    Lambda表达式的省略规则：(1)参数类型可以省略不写；(2)如果只有一个参数，参数类型可以省略，同时()也可以省略；
                         (3)如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写,同时要省略分号；
                         (4)如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。
                         此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";"不写；

     实现原理区分:匿名内部类，编译之后，产生单独的.class字节码文件；
                lambda表达式：编译之后，没有单独的.class字节码文件，对应的字节码在运行时动态生成，不会保留到本地的硬盘之中；

    可参考文章链接：https://blog.csdn.net/faramita_of_mine/article/details/120231246
                 https://blog.csdn.net/qq_45834685/article/details/121477434
                 https://blog.csdn.net/weixin_52341477/article/details/125174380
     */
}
