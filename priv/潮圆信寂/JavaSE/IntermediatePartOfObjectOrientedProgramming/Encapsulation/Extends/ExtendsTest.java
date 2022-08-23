package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Extends;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/18
 */
public class ExtendsTest {

    //继承后重写方法时，子类中重写的方法权限需要大于等于父类

    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.changeName();
        System.out.println(son1.name);
    }
}

class Son1 extends Father1{
    String name;
    @Override
    public void changeName() {
        this.name = "S";
    }
}

class Father1 extends GrandFather1{
    String name;
    @Override
    public void changeName() {
        this.name = "F";
    }
}

class GrandFather1 {
    String name;
    public void changeName() {
        this.name = "GF";
    }
}