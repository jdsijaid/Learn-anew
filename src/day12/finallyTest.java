package day12;

import org.junit.Test;
/*
1.finally是可选的
2.finally中的代码一定会被执行就算catch里面又有异常
3.像数据库连接、文件流、socket连接，数据库连接一定要关闭
jvm是不能自动回收的，所以要手动关闭，此时资源释放需要 finally
4.try catch 可以嵌套

* */
public class finallyTest {
   @Test
    public void test1(){
       try{
           int a = 0;
           int b = 10;
           int c = b /10;
       }
       catch (ArithmeticException e){
           int[] arr = new int[10];
           System.out.println(arr[10]);
           System.out.println("异常处理逻辑");
       }
       catch (Exception e){
           System.out.println("异常处理逻辑");
       }
       finally{
           System.out.println("finally");
       }


   }

    public int test2(){
       try{
           int a = 0;
           int b = 10;
           int c = b /a;
           return c;
       }
       catch (Exception e){
           System.out.println("异常处理逻辑");
           return 1;

       }
       finally{
           System.out.println("finally");
       }


   }
   public void test3(){

       try {
           int a = 0;
           int b = 10;
           int c = b /a;
           System.out.println(c);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

   }
}
