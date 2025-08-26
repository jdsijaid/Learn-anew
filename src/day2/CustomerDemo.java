package day2;
/*
* 类中方法的声明和使用
* 方法是：描述应该有的功能
* 比如：Math类：sqrt（） random（）
* 1，举例
* 方法的声明：权限修饰符返回值类型 方法名（参数列表）{
*           方法体；
* 关于权限修饰符
* 1.public
* 2private
* 3protected
* 4.default缺省封装性的时候再细说
* 先都默认使用public
* 返回值类型：
*  1有返回值
* 2没有返回值
* 如果有返回值必须方法声明返回值的类型
* 同时要用return必须返回指定类型的数据
* 如果没有返回值，则方法声明返回值类型为void通常没有返回值就不需要return如果使用只能return意思是结束此方法
* return后不可以写表达式
* 定义方法要考虑要不要返回值
* 方法的使用可以调用当前类的属性或者方法
* 方法里不能定义其他的方法但是可以调用别的方法
*
*
*
*
*
* }
* */

public class CustomerDemo {

    public static void main(String args[]){
        Customer c1 = new Customer();
        c1.name = "张三";
        c1.age = 18;
        c1.isMale = true;
        c1.show();
        c1.sleep(5);
        System.out.println(c1.getAge());
        Customer c2 = new Customer();
        c2.name = "张三";
    }
}
class Customer{
    String name;
    int age;
    boolean isMale;
    public void show(){
        System.out.println("show()方法被调用");
    }
    public void sleep(int hour){
        System.out.println(name+"正在睡觉，"+"睡了"+hour+"小时");
    }

    public int getAge() {
        return age;
    }
}
