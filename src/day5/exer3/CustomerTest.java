package day5.exer3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("zhang","san");
        Account acct = new Account(1122,20000,0.045);
        cust.setAccount(acct);
        cust.getAccount().withdraw(5000);
        cust.getAccount().deposit(3000);
        System.out.println("客户姓名："+cust.getFirstName()+" "+cust.getLastName());
        System.out.println("账户余额："+cust.getAccount().getBalance());
        System.out.println("账户月利率："+cust.getAccount().getAnnualInterestRate());
        System.out.println("账户余额："+cust.getAccount().getBalance());
    }

}
