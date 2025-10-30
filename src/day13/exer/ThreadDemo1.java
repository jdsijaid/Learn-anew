package day13.exer;
/*
线程的优先级
Max_Priority:10
Min_Priority:1
Normal_Priority:5
线程优先级：
1.线程优先级默认值为5
2.优先级高的线程分配的cpu时间片多
3.优先级高的线程不一定能优先执行
* */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //创建线程对象
        TestThread t1 = new TestThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("线程1");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);


        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getName());

        System.out.println(Thread.currentThread());;

        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                System.out.println(i+"***");
            }
        }
        t1.isAlive();
        System.out.println(t1.getPriority()+"***");

    }
}
class TestThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for( i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
            if(i % 20 == 0) {

            }
        }



    }

}
