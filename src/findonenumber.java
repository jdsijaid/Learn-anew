public class findonenumber {
    public static void main(String[] args) {
        System.out.println("1-1000之间的完全数有：");
        
        // 遍历1到1000的所有数字
        for(int i = 1; i <= 1000; i++) {
            int sum = 0; // 用于存储真因数之和
            
            // 找出i的所有真因数（小于i的因数）
            for (int j = 1; j <= i/2; j++) {
                if(i % j == 0) {
                    sum += j; // 累加真因数
                }
            }
            
            // 如果真因数之和等于原数，则为完全数
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
