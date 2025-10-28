package day12;


public class subClass  {
    public static void main(String[] args) {
     Compaes.method();
    }

}
class sub implements Compaes{

    public void method() {
        System.out.println("子类方法");
    }
}

