package day12;
/*
throws 异常处理方式
try-catch-finally 真正的处理异常
try-catch-finally 抛出异常
* */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            method2();
        }catch(Exception e){
            System.out.println("main catch");
        }
    }
   public static void method2() throws Exception{
       throw new Exception();
   }
}
