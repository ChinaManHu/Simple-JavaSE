package priv.潮圆信寂.JavaSE.MiddlePart.ObjectPartialMethods;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/23
 */
public class HashCodeDemo {
    public static void main(String[] args) {
//        1)提高具有哈希结构的容器的效率!
//        2)两个引用，如果指向的是同一一个对象，则哈希值肯定是一样的!
//        3)两个引用，如果指向的是不同对象，则哈希值是不一一样的
//        4)哈希值主要根据地址号来的!不能完全将哈希值等价于地址。
        ShowHashCode hashCode1 = new ShowHashCode();
        ShowHashCode hashCode2 = new ShowHashCode();
        ShowHashCode hashCode3 = hashCode1;
        System.out.println("hashCode1的哈希值为：" + hashCode1.hashCode());
        System.out.println("hashCode2的哈希值为：" + hashCode2.hashCode());
        System.out.println("hashCode3的哈希值为：" + hashCode3.hashCode());
    }
}
class ShowHashCode {
}