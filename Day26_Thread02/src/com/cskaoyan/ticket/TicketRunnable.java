package com.cskaoyan.ticket;

public class TicketRunnable implements Runnable{
    private int tickets = 10;
    @Override
    public void run() {
        /*while (true) {
            // 线程1进来了  tickets = 10;
            // 线程2进来了  tickets = 10;
            // 线程3进来了  tickets = 10
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets--;
            }

        }*/
        // 原子性操作：这个操作要么执行完，要不不执行
            //tickets > 0;   // tickets--;  tickets = tickets - 1;
        while (true) {
            // 线程1进来了  tickets = 1;
            if (tickets > 0) {
                // 线程二进来了
                // 线程三进来了
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                tickets--;
            } // tickets = 1; tickets = 0;
            //   tickets = 0; tickets = -1;
            //   tickets = -1; tickets = -2;
        }
    }
}
