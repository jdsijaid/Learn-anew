package day5.exer4;

public class Bank {
  private Customer[] customers;//存放多个客户的数组
  private int numberOfCustomers;//记录客户的个数
  public Bank(){
      customers = new Customer[10];
      numberOfCustomers = 0;
  }
  //添加客户
    public void addCustomer(String firstName,String lastName){
        customers[numberOfCustomers] = new Customer(firstName,lastName);
        numberOfCustomers++;
    }
    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }
}
