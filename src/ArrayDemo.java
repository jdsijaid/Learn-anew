public class ArrayDemo {
    public static void main(String args[]){
        /* 数据的常见概念
        * 数据名
        * 元素
        * 下标、角标、索引
        * 数组的长度
        *本身属于引用数据类型
        * 元素是值既可以是基本数据类型也可以是引用数据类型
        *
        * */

       int [] ids;
       //1.1
       ids = new int[]{1,2,3,4};
       //1.2动态初始化
       String[] names = new String[5];
       //初始化后一旦完成其长度就确定了
        names[0] = "张三";
        System.out.println(names.length);
        for (String name : names) {
            System.out.println(name);
            System.out.println(name.length());


        }


    }
}
