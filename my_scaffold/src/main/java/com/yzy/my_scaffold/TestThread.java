package com.yzy.my_scaffold;

/**
 * @Author YangZhenYuan
 * @Date 2020/3/4 16:47
 * @Version 1.0
 * @Describe
 */
public class TestThread {


    public static void main(String[] args) throws Exception {
        myThread mt1 = new myThread();
        myThread mt2 = new myThread();

        mt1.flag = 0;
        mt2.flag = 1;

        new Thread(mt1).start();
        new Thread(mt2).start();
    }
}

class myThread implements Runnable {

    public int flag = 0;
    private static Object o1 = new Object(), o2 = new Object();

    @Override
    public void run() {
        if (flag == 0) {
            synchronized (o1) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("flag0启动o1");
                synchronized (o2) {
                    System.out.println("flag0启动o2");
                }
            }
        }
        if (flag == 1) {
            synchronized (o2) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("flag1启动o2");
                synchronized (o1) {
                    System.out.println("flag1启动o1");
                }
            }
        }

    }
}