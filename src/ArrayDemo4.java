public class ArrayDemo4 {
    public static void main(String args[]){
//        int[] score = new int[6];
//        for (int i = 0; i < score.length; i++){
//            score[i] = (int) (Math.random() * (30 + 1));
//            System.out.println(score[i]);
//        }

        /*打印一个杨辉三角
        *
        * */
        int [][] yh = new int[10][10];
        for (int i = 0; i < yh.length; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==1){
                    yh[i][j] = 1;
                }
                else{
                    yh[i][j] = yh[i-1][j-1]+yh[i-1][j];

                }
                System.out.print(yh[i][j] + " ");
                System.out.println();

            }

        }

    }
}
