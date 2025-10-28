package day12;

import org.junit.Test;

/*
异常的体系结构分为error 和 Exception
error：错误，一般不能被程序员处理，比如StackOverflowError
Exception：异常，可以进行异常处理
Exception分为两种，运行时异常和编译时异常
运行时异常：编译时不检查，运行时检查，比如NullPointerException（空指针异常）
编译时异常：编译时检查，运行时不检查，比如IOException（输入输出异常）


* */
public class ExceptionTest {
    @Test
    public void test1(){
    int[] arr = null;

    System.out.println(arr[10]);
    }
    @Test
    public void test2(){
        int arr[] = new int[10];
        System.out.println(arr[11]);
    }
    //class CastException
    @Test
    public void test3(){
        Object obj = new Object();
        String str = (String)obj;
    }
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
    @Test
    //InputMismatchException
    public void test5(){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }

}
