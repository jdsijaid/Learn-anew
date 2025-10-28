package day10;
/*
* 1.静态代码块
* 代码块：代码块，定义在类中，类加载时执行
* 如果修饰的话只能用static修饰
* 静态代码块：静态代码块，类加载时执行，只执行一次
* 非静态代码块：非静态代码块，对象创建时执行，执行多次
* 随着对象的创建而执行
* 每创建一个对象就会执行一次非静态代码块
* 作用:创建对象时，执行一些初始化操作
* 静态代码块作用
*
*
* */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person p1 = new Person();
    }
}
class Person{
    String name;
    int age;
    static String  desc = "我是一个人";

    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.desc = "姓名："+name+"，年龄："+age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    @Override
    public String toString(){
        return "Person{name:"+name+",age:"+age+",desc:"+desc+"}";
    }
    {
        System.out.println("非静态代码块");

    }
    static{
        System.out.println("静态代码块");
    }
    public  Person(){
        System.out.println("构造方法");
    }



}

