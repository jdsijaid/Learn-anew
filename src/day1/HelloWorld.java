package day1;

/**
 * 一个简单的HelloWorld程序示例
 *
 * @author zhuangjie
 * @version 1.0
 * @since 2019-05-09
 */
public class HelloWorld {
    /**
     * 程序入口点，打印"hello world"到控制台
     *
     * @param args 命令行参数
     */
    public static void main(String args[]) {
        //输出hello world
        System.out.println("hello world");
        /*可能出现精度损失
        */


        double d1 = 12.3;//截断操作
        int i1 = (int)d1 ;
        int i2 = 127;
        byte b = (byte)i2;
        System.out.println(b);
        long l = 1234556666666L;
        System.out.println(l);
        float f1 = 12.3f;
        System.out.println(f1);
        //String 输入引用数据类型
        String str = "hello world";
        System.out.println(str);



    }
}