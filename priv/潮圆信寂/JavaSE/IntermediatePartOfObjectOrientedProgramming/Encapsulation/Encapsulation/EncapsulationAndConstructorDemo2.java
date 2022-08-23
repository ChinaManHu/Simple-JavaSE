package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.Encapsulation;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/15
 */
public class EncapsulationAndConstructorDemo2 {
    public static void main(String[] args) {
        //Account类要求具有属性：姓名（长度2~4位），余额（必须>20），密码（必须是六位）
        //如果不满足，则给出提示信息，并给默认值
        //通过setXxx方法给Account的属性赋值
        Account account = new Account("潮圆信寂", 666666, "123456");
        account.info();
    }
}

class Account {
    public String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;
        this.setBalance(balance);
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }
        else {
            System.out.println("您输入的姓名有误！（已改为默认值：张三）");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        }
        else {
            System.out.println("您太穷了！！！（已改为默认值：666）");
            this.balance = 666;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        }
        else {
            System.out.println("您输入的密码有误!!!（已改为默认值：000000）");
            this.password = "000000";
        }
    }

    public void info() {
        System.out.println("姓名为：" + this.name + "\n余额为：" + this.balance + "\n密码为：" + this.password);
    }
}