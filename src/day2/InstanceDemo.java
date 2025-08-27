package day2;/*

 如何理解万事万物皆对象？
 1。在Java语言中，我们都将功能结构等封装到类中通过类的实列化来调用具体的功能结构
 2.涉及到Java与前端和后端的数据库交互时候都体现为类、对象
 匿名对象只能用一次
*/

public class InstanceDemo {
    public static void main(String args[])
    {
        new Phone().showprice(100);
        new Phone().showprice(10);
    }
}
class Phone{
    double price;
    public void call()
    {
        System.out.println("打电话");
    }
    public void sendMessage()
    {
        System.out.println("发短信");
    }
    public void showprice(int price){
        System.out.println("价格是："+price);

    }
}
