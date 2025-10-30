package day13;
/*
* 多线程的创建，方式一：
* 继承Thread类，重写run方法，创建线程，调用start方法启动线程
* 此线程将执行的操作声明在run（）方法中
* 启动线程必须调用start方法，不能调用run方法
* 再多想启动一个线程，必须new一个对象，然后调用start方法启动线程
* */
class MyTread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //创建线程对象
      MyTread t1 = new MyTread();
      t1.start();
      for(int i = 0; i < 1000; i++){
            if(i % 2 != 0){
                System.out.println(i+"***");
            }
        }

    }

}
