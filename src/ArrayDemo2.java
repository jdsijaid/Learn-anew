public class ArrayDemo2 {
    public static void main(String args[])
    {
        //一个数组的元素是一维数组就是二维数组
        int[] arr = new int[3];
        //静态初始化二维数组
        int[][] arr2 = new int[][]{{1,2,3},{1,2},{2,3}};
        //动态初始化二维数组
        String[][] arr3 = new String[3][2];
        //动态初始化2
        String[][] arr4 = new String[3][];
        //获取数组长度
        System.out.println(arr3 .length);
        System.out.println(arr3[1].length);
        //如何遍历二维数组
        for (int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3[i].length; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }



    }
}
