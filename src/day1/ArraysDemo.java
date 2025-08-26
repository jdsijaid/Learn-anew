package day1;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b ={1,2,3,9,10,4,5,6,8,7,9,10};
        //比较两个数组是否相等
        boolean isEqual = Arrays.equals(a,b);
        System.out.println(isEqual);
        //输出数组信息
        System.out.println(Arrays.toString(a));
        //将指定的值添加到数组
        Arrays.fill(a,10);
        //排序
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b,100));
        //返回下标，负数就是没找到




    }
}
