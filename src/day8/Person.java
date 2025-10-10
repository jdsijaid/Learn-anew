package day8;

public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }
    public void show(){
        System.out.println("姓名："+name+"，年龄："+age);
    }

}
