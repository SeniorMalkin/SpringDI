package com.netcracker.zoo;



abstract class Animal implements IAnimal {
    String feed;
    String name;

    @Override
    public String toString() {
        String res = "My name - " + name + "  " + eat();
        return res;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    public String getFeed() {
        return feed;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
