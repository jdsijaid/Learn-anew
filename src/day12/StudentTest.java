package day12;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.show(10);
        student.regist(-10);
    }

}
class Student{
    public void show(int age){
        System.out.println("show()");
    }
    public void regist(int age){
        if(age < 0 || age > 120){
            throw new RuntimeException("年龄需要在0-120之间");
        }
    }
}
