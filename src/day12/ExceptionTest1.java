package day12;
/*
异常的处理：抓抛模型
过程一：”抛的异常“，一旦运行时异常，
就会向上抛出，其后的代码就不会再执行了
过程二：”抓“可以理解成异常的处理方式1.try catch finally 2.throws
二、try catch finally
try{
    可能产生异常的代码
}catch(异常类名 变量名){
    异常的处理逻辑
}
catch(异常类名 变量名){
    异常的处理逻辑
}

finally{
    无论是否产生异常，都会执行的代码
}
catch中异常类如果没有子父类关系，则声明顺序不重要，如果有的话子类必须在父类之前否则会报错
在try结构中声明的变量在外面不可见
* */
public class ExceptionTest1 {
    public static void main(String[] args) {
        String str = "123";
        str = "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.println("异常的处理逻辑");
            /*
            * 常用的输出异常方式*/
            System.out.println(e.getMessage());
            e.printStackTrace();


        }
        System.out.println("hello world");


    }
}
