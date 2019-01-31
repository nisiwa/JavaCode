package com.cskaoyan.store;

public class ConsumeRunnable implements Runnable{
    Store store;

    public ConsumeRunnable(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.consume();
        }
    }
}
