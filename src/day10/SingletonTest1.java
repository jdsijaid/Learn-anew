package day10;

public class SingletonTest1 {
}
//饿汉试
class Bank{
    private Bank(){}

    private  static Bank instance = new Bank();
    /*提供公公静态的方法，返回类的对象*/
    public static Bank getInstance(){
        return instance;
    }

}
