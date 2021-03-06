package com.raghav.observer;

public interface Subject {
    void subscribe(Observer subscriber);

    void unSubscribe(Observer subscriber);

    void notifySubscribers();

    void upload(String title);
}
