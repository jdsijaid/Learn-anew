package day12;
/*
方法重写规则：
子类重写抛出的异常类型不能大于父类抛出的异常类型
* */
public class OverrideTest {
}
class  SuperClass{
    public void show(){
        System.out.println("SuperClass show()");
    }

}