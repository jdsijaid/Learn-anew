package day1;

public class ArrayDemo5
{
    public static void main(String args[])
    {
        //公式(int)(Math.random() * (max - min + 1)) + min;
        //(0.0 - 1.0 * (100-2 +1))+2；
        int[] arry = new int[10];
        int maxnumber =0;
        int sum = 0;
        for (int i = 0; i<arry.length;i++){
            arry[i] = (int)(Math.random()*(99-10+1)+10);
            if(arry[i]>maxnumber){
                maxnumber = arry[i];
            }
            sum += arry[i];
            System.out.print(arry[i]+" ");



        }
        System.out.println("最大值是："+maxnumber);
        System.out.println("平均值是："+sum/arry.length);
        System.out.println("和值是"+sum);



    }
}
