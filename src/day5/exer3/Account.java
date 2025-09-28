package day5.exer3;

public class Account {
  //账号
    private int id;
    private double balance;//余额
    private double annualInterestRate;//年利率

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account(int id,double balance,double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("余额不足");
        }
        else{
            balance = balance - amount;
            System.out.println("取款成功，余额为："+balance);
        }

    }
    public void deposit(double amount){
        if (amount>0) {
            balance = balance + amount;
            System.out.println("存款成功，余额为：" + balance);
        }
    }

}
