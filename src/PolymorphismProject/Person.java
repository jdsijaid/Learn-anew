package PolymorphismProject;

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
    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(){
        System.out.println("走路");
    }
    public void showAge(){
        System.out.println("年龄："+age);
    }

}
