package day7.Student;
/*
* 方法的重写
* 子类继承父类之后，可以对同名和同参数列表的方法进行覆盖重写
* 重写之后通过子类对象调用子类中同参数列表的方法，会调用子类中的方法
*子类重写方法的权限修饰符要和父类一致或者子类权限修饰符要大于父类权限修饰符
* 特殊情况子类不能重写声明为private的父类方法
* 父类被重写的方法返回值类型是void则重写的只能是void
* 被重写的返回值类型是和重写的返回值数据类型一致或者子类返回值类型是父类返回值类型的子类
* */
public class PersonTest {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "张三";
    s1.age = 18;
    s1.major = "软件工程";
    System.out.println(s1.name);
    s1.eat();

    }
}
