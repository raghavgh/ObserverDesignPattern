package com.raghav.observer;

public interface Observer {
    void update();

    void subscribeChannel(Subject channel);
}
