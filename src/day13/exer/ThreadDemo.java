
/*
*
* 测试Thread的常用方法
* 1.start():启动当前线程，调用当前线程的run()
* 2.run():重写Thread类中的run()方法，将创建的线程要执行的操作声明在此方法中
* 3.currentThread():获取当前代码执行的线程
* 4.getName():获取当前线程的名字
* 5.setName():设置当前线程的名称
* 6.yield():释放当前cpu的执行权
* 7.join():在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才继续执行
*
* */
package day13.exer;
class jishuThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
class oushuThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            if(i % 2 != 0){
                System.out.println(i+"***");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        jishuThread t1 = new jishuThread();
        new jishuThread(){
            @Override
            public void run() {
                for(int i = 0; i < 1000; i++){
                    if(i % 2 != 0){
                        System.out.println(i+"***");
                    }
                }
            }

        }.start();
    }
}
