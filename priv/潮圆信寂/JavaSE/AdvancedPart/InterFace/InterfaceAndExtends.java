package priv.潮圆信寂.JavaSE.AdvancedPart.InterFace;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/4 13:19
 *
 */


public class InterfaceAndExtends {
    public static void main(String[] args) {
        //  接口和继承的简单结合
        LitterMonkey litterMonkey = new LitterMonkey("悟空");
        litterMonkey.flying();
        litterMonkey.Climbing();
        litterMonkey.swimming();
    }
}

class Monkey {
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void Climbing() {
        System.out.println(this.name + "学会了爬树...");
    }
}

interface Swimming {
    void swimming();
}

interface Fly {
    void flying();
}

class LitterMonkey extends Monkey implements Swimming, Fly {
    public LitterMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(this.getName() + "学会了游泳...");
    }

    @Override
    public void flying() {
        System.out.println(this.getName() + "学会了飞...");
    }
}