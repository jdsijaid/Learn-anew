import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int[] score;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入人数");
        int number = scanner.nextInt();
        score = new int[number];
        int maxscore = 0;
        for (int i = 0; i < score.length; i++){
            System.out.println("请输入第" + (i+1) + "个同学的分数");
            score[i] = scanner.nextInt();
            if (maxscore < score[i]){
                maxscore = score[i];
            }



        }
        for (int i = 0; i < score.length; i++){
            System.out.println("第" + (i+1) + "个同学的分数是：" + score[i]);
        }









//       18013820100
    }
}
