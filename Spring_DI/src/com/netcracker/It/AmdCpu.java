package com.netcracker.It;

public class AmdCpu implements ICpu {
    public void start() {
        System.out.println("Start Amd CPU");
    }

    public void perfomance() {
        System.out.println("4 kernel");
    }

    @Override
    public String toString() {
        return "Amd CPU";
    }
}

