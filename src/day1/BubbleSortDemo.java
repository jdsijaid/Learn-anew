package day1;

public class BubbleSortDemo {
    public static void main(String[] args){
        int[] a = {534,44,33,24,15,21,10,31,9,2,14,45,};
        //冒泡排序
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        for(int i=0;i<a.length-1;i++){
            for(int j =0; j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }

        System.out.println();
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}
