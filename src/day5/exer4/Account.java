package day5.exer4;

public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("取款成功，余额为："+balance);
        }else{
            System.out.println("余额不足");
        }
    }
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
        }
        System.out.println("存款成功，余额为："+balance);

    }
}
