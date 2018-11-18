package com.ngockhuong.nonblocking;

import java.util.function.Supplier;

public class DataAsync implements Supplier<String> {
    private int id;
    private long simulationDuration;

    public DataAsync(int id, long simulationDuration) {
        this.id = id;
        this.simulationDuration = simulationDuration;
    }

    @Override
    public String get() {
        try {
            Thread.sleep(this.simulationDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data-" + id;
    }
}
