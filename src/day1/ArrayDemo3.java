package day1;

public class ArrayDemo3 {
    //二维数组分为内层和外层
    /*
    * 外层是arr[0],arr[1],arr[2]等
    * 内层是arr[0][0],arr[0][1],arr[0][2]等
    *
    * */
    public static void main(String args[])
    {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值
        System.out.println(arr[0][0]);//0
//        System.out.println(arr);
        float[][] arr2 = new float[3][2];
        System.out.println(arr2[0]);//地址值
        System.out.println(arr2[0][0]);//0.0
//        System.out.println(arr2);
        String[][] arr3 = new String[2][];
        System.out.println(arr3[0]);//null
//        System.out.println(arr3[0][0]);空指针异常
        /*总结
        * 外层元素的初始化值为地址值
        * 内层元素则是和元素类型有关
        * */



    }

}
