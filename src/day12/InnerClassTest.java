package day12;
/*
类的内部成员如果a允许声明在b的类中，那么a就是b的内部成员
成员内部类：一方面作为外部类的成员
一个方面作为一个类类内的成员可以定义构造器属性
* */
public class InnerClassTest {
    Person p = new Person();
    Person.boy b = p.new boy();

}
class Person{
    class girl{

    }
    class boy{

    }
}
