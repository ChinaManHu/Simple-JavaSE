package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.WorkInThisChapter;

/**
 * @author 潮圆信寂
 * @date 2022/8/29
 */
public class Exercise05 {
    public static void main(String[] args) {
//      扩展如下的BankAccount类
//      要求:
//        class BankAccount {
//            private double balance;
//
//            public BankAccount(double initialBalance) {
//                this.balance = initialBalance;
//            }
//
//            public void deposit(double amount) {
//                balance + = amount;
//            }
//
//            public void withdraw(double amount) {
//                balance -= amount
//            }
//      (1)在上面类的基础上扩展新类CheckingAccount对每次存款和取款都收取1美元的手续费
//      (2)扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生，(earnMonthlyInterest方法被调用)
//      并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数


    }
}

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    double oldBalance = this.getBalance();


}

