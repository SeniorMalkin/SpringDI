package com.netcracker.It;

public class Computer {
    ICpu processor;
    int year;

    public Computer() {
    }

    public void init() throws Exception {
        System.out.println("Some initialization work");
    }

    public void destroy() throws Exception {
        System.out.println("Some destruction work");
    }

    public Computer(ICpu processor) {
        this.processor = processor;
    }

    public Computer(ICpu processor, int year) {
        System.out.println("Create computer");
        this.processor = processor;
        this.year = year;
    }

    public void setProcessor(ICpu processor) {
        System.out.println("Set processor  " + processor);
        this.processor = processor;
    }

    public ICpu getProcessor() {
        return processor;
    }

    public void setYear(int year) {
        System.out.println("Set year  " + year);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return processor.toString() + "   Year of build:"  + year;
    }
}
