package day7.atguigu;

public class ExtendsTest {
    public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "张三";
    p1.age = 18;
    p1.sleep();
    Student s1 = new Student();
    s1.name = "张三";
    s1.age = 18;
    s1.major = "软件工程";
    s1.sleep();
    System.out.println(s1.name);
    System.out.println(s1.age);
    s1.eat();
    s1.study();
    }


}
