package day2;

public class CricleDemo {
    public static void main(String args[])
    {
        Cricle c1=new Cricle();
        c1.radius=3.0;
        System.out.println(c1.findArea());

    }

}
/*
面向对线编程的三条主线是什么
1类以及类的成员：属性和方法的构造器
2面向对象的三大特征：封装继承多态
面向对象的编程思想
（类、对象：面向对象的三大特征：）
封装继承多态
面向对象的继承思想？
其他关键字this.super、final、abstract、interface、package,import
类是抽象的概念对象是具体实例，开发的列子
对象就：实实在在的一个个体
对象是由类衍生出来的
3面向对象的体现：类对象的创建和执行操作有哪三步
1创建类
2类的实列化
3调用对象的结构
* */
class Cricle{
    double radius;
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
