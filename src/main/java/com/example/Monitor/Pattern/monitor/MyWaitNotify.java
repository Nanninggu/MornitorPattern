package com.example.Monitor.Pattern.monitor;

public class MyWaitNotify {
    MonitorObject myMonitorObject = new MonitorObject();

    public void doWait() {
        synchronized (myMonitorObject) {
            try {
                myMonitorObject.wait();
            } catch (InterruptedException e) {
                // Log exception
            }
        }
    }

    public void doNotify() {
        synchronized (myMonitorObject) {
            myMonitorObject.notify();
        }
    }
}
