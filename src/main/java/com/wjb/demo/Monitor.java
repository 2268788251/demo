package com.wjb.demo;

import java.util.concurrent.locks.LockSupport;

public class Monitor {
    private Thread monitorThread;

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.start();
        try {
            Thread.sleep(10000);
//            monitor.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        monitorThread = new Thread(() -> {
            while (true){
                Thread thread = Thread.currentThread();
                if (thread.isInterrupted()){
                    System.out.println("优雅的关闭");
                    break;
                }
                    LockSupport.park();
                    System.out.println("监控中");
            }
        });
        monitorThread.start();

    }

    public void close(){
        monitorThread.interrupt();
    }
}
