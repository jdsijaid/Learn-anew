package day7.Student;

public class Student extends Person{
    String major;
    public Student(String name,int age,String major){
        super(name,age);
        this.major = major;
    }
    public void study(){
        System.out.println("学习专业是"+  major);
    }
    public Student(){

    }
    public void  eat(){
        System.out.println("吃学生饭");
    }
    public Student(String major){
        this.major = major;
    }
}
