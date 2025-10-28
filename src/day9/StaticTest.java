package day9;

/*
* 1.static:静态的
* 2。static可以用于类成员变量、类成员方法、静态代码块、静态内部类
* */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "张三";
        c1.age = 18;
        Chinese c2 = new Chinese();
        c2.name = "张三";
        c2.age = 18;
        Chinese.country="日本";
        System.out.println(c1.country);
        Chinese.show();
        c2.show();

    }
}
class Chinese{
    String name;
    int age;
    static String country = "中国";
    public static void show(){
        System.out.println("show方法");
    }
}
