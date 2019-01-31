package com.cskaoyan.store;

public class ProduceRunnable implements Runnable{
    Store store;

    public ProduceRunnable(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.produce();
        }
    }
}
