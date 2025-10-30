package day12;
/*
如何自定义异常类
1.继承Exception或者RuntimeException
2.提供一个serialVersionUID

* */
public class MyException extends  RuntimeException{
    static final long serialVersionUID = -703489719039L;
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}
