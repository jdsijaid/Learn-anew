package day1;

public class ArrayDemo6 {
    public static void main(String args[]){
        int[] array1 = {2,3,5,7,11,13,17,19};
        int[] array2 = new int[array1.length];
//        for(int i=0;i<array1.length;i++){
//            if(i % 2 == 0 && i != 0 ){
//                array2[i] = i;
//
//            }
//            else{
//                array2[i] = array1[i];
//            }
//            System.out.println(array2[i]);
//
//        }
        //数组的反转
        int sum;
        for(int i=0;i<array1.length/2;i++){
            sum =array1[i];
            array1[i] = array1[array1.length-1-i];
            array1[array1.length-1-i] =sum;


        }
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);

        }
        //查找
        //线性查找
        boolean isFlag = false;
        int number = 100;
        for (int i = 0; i < array1.length; i++){
               if (array1[i] == number){
                   System.out.println("找到了");
                   System.out.println("索引是"+i);
                   isFlag = true;

               }


        }
        if(!isFlag){
            System.out.println("没有找到");

        }
        //二分查找法
        //速度快
        //所要找的要有序
        int[] arry = new int[1000];
        for (int i = 0; i < arry.length; i++){
            arry[i] = i;
        }
        int number1= 800;
        int head = 0;
        int end = arry.length-1;
        int sum1=0;
        while(head<=end){
            int middle = (head+end)/2;
            if (number1 == arry[middle]){
                System.out.println("找到了，位置是："+middle);
                break;
            } else if (number1< arry[middle]) {
                end = middle-1;
                
            }
            else {
                head = middle+1;
            }
            sum1++;
        }
        int sum2=0;
        //线性查找对比
        for (int i = 0; i < arry.length; i++){
            if (number1 == arry[i]){
                System.out.println("找到了，位置是："+i);
                break;
            }
            sum2++;
        }
        System.out.println("二分查找的次数是："+sum1);
        System.out.println("线性查找的次数是："+sum2);




    }
}
