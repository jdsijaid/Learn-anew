package day1;

public class ArrayReview {
    public static void main(String args[]){
        int[] arr = new int[10];
        for(int i =0; i<arr.length;i++){
            arr[i] = 10-i;
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =0; i<arr.length-1;i++){
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;

        }
        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
