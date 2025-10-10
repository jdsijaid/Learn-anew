package day8.PolymorphismProject;

public class PersonTest {
    public static void main(String[] args) {
    Person peter = new Man();
    peter.eat();
    peter.walk();
    peter.name = "张三";
    Object test = new Object();
    //有了对象的多态性，在内存中其实是加载了子类的属性和方法
    //如何调用子类特有的属性和方法
    //使用强制转换类型

    if(peter instanceof Man){
        Man Peter1 = (Man)peter;
        Peter1.iswalk = true;
        Peter1.show();

    }




    }

}
