package com.raghav.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Observer> subs = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Observer subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void unSubscribe(Observer subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Observer sub : subs) {
            sub.update();
        }
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
