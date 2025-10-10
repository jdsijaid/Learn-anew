package day7.Student;

public class Person {

    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public Person(){
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void walk(int length){
        System.out.println("走路"+  length);
    }
}
