package day7.atguigu;
/*
* 面向对象特征之二：继承性
* 1.继承性：子类继承父类的属性和方法，子类可以扩展父类的功能
* 2.减少代码重复，提高代码的复用性
* 3.便于功能扩展
* 4.为多态使用的，提供了前提
* 二、继承性的格式：class A extends B{}
* A：子类、派生类、subclass
* B：父类、基类、superclass
* 5.子类对象不能调用父类中private修饰的成员变量和方法
* 6.还是继承到了只是不能调用父类中private修饰的成员变量和方法
* */

public class Student  extends Person{

    String major;
    public Student(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public Student(){

    }

    public void study(){
        System.out.println("学习学习学习");
    }

}
