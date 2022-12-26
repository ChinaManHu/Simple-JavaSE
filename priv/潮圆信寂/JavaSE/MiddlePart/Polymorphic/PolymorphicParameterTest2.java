package priv.潮圆信寂.JavaSE.MiddlePart.Polymorphic;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/22
 */
public class PolymorphicParameterTest2 {
    public static void main(String[] args) {
        //多态参数：形参为父类类型，实参类型允许为子类类型
//        (1)定义员工类Employee,包含姓名和月工资[private],以及计算年工资getAnnual的方法。
//           普通员工和经理继承了员工，经理类多了奖金bonus属性和管理manage方法，普通员工类多了work方法
//           普通员工和经理类要求分别重写getAnnual方法
//        (2)测试类中添加一个方法showEmpAnnual(Employee e),实现获取任何员工对象的年工资
//           并在main方法中调用该方法[e.getAnnual()]
//           测试类中添加一个方法，testWork,如果是普通员工,则调用work方法，如果是经理，则调用manage方法
        Test test = new Test();
        Employee employee = new Employee();
        OrdinaryEmployee ordinaryEmployee = new OrdinaryEmployee();
        Manager manager = new Manager();
        employee.setName("王师傅");
        employee.setSalary(6000);
        manager.setBonus(12000);
        manager.setName("海经理");
        manager.setSalary(66666);
        ordinaryEmployee.setName("普通员工");
        ordinaryEmployee.setSalary(1000);
        test.showEmpAnnual(employee);
        test.showEmpAnnual(manager);
        test.showEmpAnnual(ordinaryEmployee);
        System.out.println();
        test.testWork(employee);
        test.testWork(manager);
        test.testWork(ordinaryEmployee);
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee() {
        this.name = getName();
        this.salary = getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAnnual() {
        return "年工资为：" + this.salary * 12;
    }
}

class OrdinaryEmployee extends Employee{
    public void work() {
        System.out.println("普通员工正在工作中！！！");
    }

    @Override
    public String getAnnual() {
        return "普通工人的年工资为：" + this.getSalary() * 12;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager() {
        super();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public String getAnnual() {
        return "经理的年工资为：" + (bonus + this.getSalary() * 12) + "（奖金+薪水）";
    }

    public void manage() {
        System.out.println("经理正在工作！！！");
    }
}

class Test {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Manager)
        {
            ((Manager)e).manage();
        }
        else if (e instanceof OrdinaryEmployee)
        {
            ((OrdinaryEmployee)e).work();
        }
        else
        {
            System.out.println("传入的参数类型有误！");
        }
    }
}