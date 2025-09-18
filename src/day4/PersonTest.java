package day4;

public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setName("张三");
        p.setAge(18);
        p.show();
    }
}
//this当前对象
//我们可以使用this属性和方法通常我们都省略
class Person{
   private String name;
   private int age;
   public void show(){
       System.out.println(name+"---"+age);
   }
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       this.age= age;
   }
   public int getAge(){
       return age;
   }
   public Person(){
       System.out.println("无参构造方法");
   }
   public Person(String name,int age){
       this.name=name;
       this.age=age;
   }



}
