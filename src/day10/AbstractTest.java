package day10;
/*
*abstract关键字的使用
* 1.抽象的
* 2.抽象类：抽象类不能实例化对象，抽象类中可以有抽象方法，抽象方法没有方法体
* 3.若子类重写了父类所有抽象发法才能实例化对象
* */
public class AbstractTest {
    public static void main(String[] args) {

    }
}
abstract class Person1{
    String name;
    int age;
    public Person1(){
        System.out.println("无参构造方法");
    }
    public abstract void study();



}
abstract class Student extends Person1{



}
