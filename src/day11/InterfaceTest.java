package day11;
/*
* 1.接口使用interface来定义
* 2.java中接口和类是并列的两个结构
* 3.如何定义接口：定义接口中的成员
* jdk 7以前是只能定义全局常量和抽象方法
* 如果实现覆盖了接口的所有抽象方法，则此实现类
* 接口不可以实列化，接口不能定义构造器
* */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
    }

}
interface Flyable{
     int MAX_SPEED = 7900;
    int MIN_SPEED = 1;
     void fly();
     void stop();

}
interface Attackable{
    void attack();
}
class Plane implements Flyable, Attackable{
    public void fly(){
        System.out.println("飞机可以飞");
    }
    public void stop(){
        System.out.println("飞机可以停止");
    }
    public void attack(){
        System.out.println("飞机可以攻击");
    }
}

