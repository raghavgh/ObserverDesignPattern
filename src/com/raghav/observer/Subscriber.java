package com.raghav.observer;

public class Subscriber implements Observer {
    private String name;
    private Subject channel = new Channel();

    @Override
    public void update() {
        System.out.println("Hey " + this.name + ", Video Uploaded");
    }

    @Override
    public void subscribeChannel(Subject channel) {
        this.channel = channel;
    }

    public Subscriber(String name) {
        this.name = name;
    }
}
