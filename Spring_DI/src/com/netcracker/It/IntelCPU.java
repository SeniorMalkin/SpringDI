package com.netcracker.It;

public class IntelCPU implements ICpu {

    public void start() {
        System.out.println("Start Intel CPU");
    }

    public void perfomance() {
        System.out.println("8 kernel");
    }

    @Override
    public String toString() {
        return "Intel CPU";
    }
}
