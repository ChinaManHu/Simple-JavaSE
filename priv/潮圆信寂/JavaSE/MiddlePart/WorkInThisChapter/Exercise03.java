package priv.潮圆信寂.JavaSE.MiddlePart.WorkInThisChapter;

/**
 * @author 潮圆信寂
 * @date 2022/8/29
 */
public class Exercise03 {
    public static void main(String[] args) {
//        通过继承实现员工资核算打印功能
//        父类:员工类
//        子类:部门经理类、普通员工类
//        (1)部门经理工资= 1000+单日工资*天数*等级(1.2)
//        (2)普通员工工资=单日工资*天数*等级(1.0)
//        (3)员工属性:姓名，单日工资，工作天数
//        (4)员工方法(打印工资)
//        (5)普遍员工及部门经理都是员工子类，需要重写打印工资方法。
//        (6)定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资
        NormalEmployee normalEmployee = new NormalEmployee("老六", 100, 30);
        Manager manager = new Manager("小王", 300, 20);
        normalEmployee.showSalary();
        manager.showSalary();
    }
}

class Employee {
    private String name;
    private double dailyWage;
    private int workingDays;

    public Employee(String name, double dailyWage, int workingDays) {
        this.name = name;
        this.dailyWage = dailyWage;
        this.workingDays = workingDays;
    }

    public String getName() {return this.name;}

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public void showSalary() {
        double salary;
        salary = this.dailyWage * this.workingDays;
        System.out.println("员工工资为：" + this.dailyWage + "(每日工资)\t*\t" + this.workingDays + "(工作天数)\t=" + salary);
    }
}

class Manager extends Employee {

    public Manager(String name, double dailyWage, int workingDays) {
        super(name, dailyWage, workingDays);
    }

    @Override
    public void showSalary() {
        double salary;
        salary = this.getDailyWage() * this.getWorkingDays() * 1.2 + 1000;
        System.out.println("部门经理工资为：" + 1000 + "(奖金)+" + this.getDailyWage() + "(单日工资)*" + this.getWorkingDays() + "(工作天数)*1.2(等级)=" + salary);
    }
}

class NormalEmployee extends Employee {

    public NormalEmployee(String name, double dailyWage, int workingDays) {
        super(name, dailyWage, workingDays);
    }

    @Override
    public void showSalary() {
        double salary;
        salary = this.getDailyWage() * this.getWorkingDays();
        System.out.println("普通员工工资为：" + this.getDailyWage() + "(单日工资)*" + this.getWorkingDays() + "(工作天数)=" + salary);
    }
}