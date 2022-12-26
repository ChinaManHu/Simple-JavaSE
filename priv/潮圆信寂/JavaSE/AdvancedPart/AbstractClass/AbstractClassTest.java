package priv.潮圆信寂.JavaSE.AdvancedPart.AbstractClass;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/3 13:32
 *
 */


public class AbstractClassTest {
    public static void main(String[] args) {
        Manager manager = new Manager("老王", 110, 666666, 66666);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("小六", 100001, 3000);
        commonEmployee.work();
    }
}

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "工作中...");
    }
}

class CommonEmployee extends Employee {

    public CommonEmployee(String name, int id, double salary)
    {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + "工作中...");
    }
}