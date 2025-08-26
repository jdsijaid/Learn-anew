package day2;

public class demo1 {
    /*java面向对象的三条主线
    * 1.java类以及类的成员：属性、方法、构器；代码块、内部类
    * 2.面向对象的三大特征：封装、继承、多态、(抽象)
    * 3.其他关键字：this、static、super、final、 abstract、 interface、package
    * “大处着眼，小处着手”
    * */
    public static void main(String args[]){
        Person1 p1 = new Person1();
        p1.sex = 0;
        p1.age = 19;
        p1.study();
        p1.addAge(19);
        p1.showAge();

    }

}
