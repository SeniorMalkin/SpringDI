package com.netcracker.It;

import com.netcracker.It.ICpu;

public class Mac extends Computer {
    String woow;
    public void init() throws Exception {
        System.out.println(getWoow());
    }

    public void setWoow(String woow) {
        this.woow = woow;
    }

    public String getWoow() {
        return woow;
    }

}
