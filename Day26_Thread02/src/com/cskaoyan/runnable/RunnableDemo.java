package com.cskaoyan.runnable;
/*
    实现线程的第二种方式：
        1. 声明实现 Runnable 接口的类
        2. 该类然后实现 run 方法
        3. 创建该类的实例
        4. 创建Thread对象，将第3步创建的对象做为参数传递

    有了方式一，为什么还需要方式二呢？
        解决了单继承的局限性
        还有一个优点，便于多线程共享数据
        较好的体现了面向对象的编程思想，将线程和任务进行分离，降低耦合性
 */
public class RunnableDemo {
    public static void main(String[] args) {
        // 3. 创建该类的实例
        Runnable runnable = new MyRunnable();
        // 4. 创建Thread对象，将第3步创建的对象做为参数传递
        Thread thread = new Thread(runnable,"刘亦菲");
        thread.start();
        // thread.setName("刘亦菲");
    }
}
