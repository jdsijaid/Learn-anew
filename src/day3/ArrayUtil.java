package day3;
/*
* 自定义数组的工具类
* */
public class ArrayUtil {
    //求数组最大值
    public static int getMex(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;

    }
    //求数组最小值
    public static int getmin(int[] arr){
        int min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;

    }
    //求数组总和
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    //反转数组
    public static void reverse(int[] arr){
        for(int i =0;i<arr.length/2-1;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            System.out.println(arr[i]);
        }
    }
    //复制数组
    public static int[] copy(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //数组排序
    public static void sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    //遍历数组
    public static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
