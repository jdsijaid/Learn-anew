package day2;

public class PersonDemo {
    /*
    * 属性=成员变量=field = 域
    * 方法 =成员方法=function = 逻辑方法
    *
    * 面向对象的思想落地和实现
    * 或对象。属性或者对象.方法调用对象的结构
    * 如果创建一个类的多个对象，那么对象之间是独立的，互不影响非（static）
    * 意味着我们修改一个属性a的值，其他对象属性a的值不会改变
    * */
    public static void main(String args[])
    {
        Person p1 = new Person();
        p1.name = "张三";
        p1.eat();
        p1.age = 18;
        p1.sleep();
        p1.work();
        Person p2 = new Person();
        Person p3 = p1;
        p3.age = 19;
        System.out.println(p1.age);
        //导致p1和p3指向了堆空间同一个空间







    }

}
class User{
    //属性或成员变量
    String name;
    int age;
    void eat(String food){
        String name;//形参也是局部变量
  /*      变量都有作用域，先声明后使用
        定义变量的格式：数据类型 变量名 = 值;
        关于权限修饰符不同
        属性：可以在声明属性时添加权限修饰符
        目前声明属性都使用却省
        局部变量：不可以添加权限修饰符
        属性：是类的属性是根据类型有默认的值
        比如int 的就是0
        float 的就是0.0f
        局部变量是没有默认值，必须赋值
        特别的：形参赋值的时候赋值就可以了
        在内存中加载的位置也不同：
        属性：加载在堆空间（目前）
        变量是在栈空间（目前）

        */


        System.out.println(food+"吃饭");
    }


        }
class Person{
    String name;
    int age =1;
    boolean isMale;
    public void eat(){
        System.out.println(name+"吃吃吃");
    }
    public void sleep(){
        System.out.println(name+"睡睡睡");
    }
    public void work(){
        System.out.println(name+"工作工作");
    }

}
