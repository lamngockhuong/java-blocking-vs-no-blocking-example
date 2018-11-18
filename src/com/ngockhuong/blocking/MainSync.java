package com.ngockhuong.blocking;

public class MainSync {
    public static void main(String[] args) {
        long startTime, endTime;

        DataSync dataSync1 = new DataSync(1, 5000); // 5s
        DataSync dataSync2 = new DataSync(2, 2000); // 2s
        DataSync dataSync3 = new DataSync(3, 3000); // 3s

        startTime = System.currentTimeMillis();
        System.out.println("Start");

        String d1 = dataSync1.get();
        printData(d1);

        String d2 = dataSync2.get();
        printData(d2);

        String d3 = dataSync3.get();
        printData(d3);

        endTime = System.currentTimeMillis();
        System.out.println("Done");

        System.out.print("Execution time (ms): " + (endTime - startTime));
    }

    private static void printData(Object data) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Synchronously printing " + data);
    }
}
