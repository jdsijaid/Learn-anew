package day8;
/*
* super的作用
* 1.调用父类的构造方法
* 2.调用父类的属性或者方法
* 3.调用父类的静态属性或者方法
* 4.super.属性或者方法调用父类的属性或者方法
* 5.super.属性或者方法调用父类的静态属性或者方法
* 6.super.属性或者方法调用父类的属性或者方法
* 7.super.属性或者方法调用父类的属性或者方法
* 8如果定义了同名的父类属性或者方法，那么子类对象访问属性或者方法时，会优先访问子类属性或者方法想要访问父类的必须使用super关键字
* super调用父类构造器
* 必须写在子类构造器的第一行
* super（参数列表）
* 在构造器首行没有显试声明thisi或者super则默认调用super（）
*
* */

public class Student extends Person {
    String major;
    int age;

    public Student(){
        super("张三",18);

    }
    public Student(String major){
        this.major = major;
    }
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age+"，专业："+major);
        System.out.println("父类年龄"+super.age);
        super.show();
    }


}
