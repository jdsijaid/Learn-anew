package day10;
/*
* final 用来修饰方法
* 表明此方法不能被重写
* final 修饰变量
* 表示此变量不能被修改，变成成常量
* 尤其是使用final修饰的形参一旦赋值，那么只能使用不能修改
* */
public class FinalTest {

}
//不能被继承,比如String、system
final class FinalA{
    String name;

}
class FinalB {

}