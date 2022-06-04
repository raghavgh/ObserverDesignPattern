package com.raghav.observer;

public class Youtube {

    public static void subscription(Subject channel, Observer subscriber){
        channel.subscribe(subscriber);
        subscriber.subscribeChannel(channel);
    }

    public static void main(String[] args) {
        // write your code here
        Subject raghav = new Channel();
        Observer s1 = new Subscriber("Raghav");
        Observer s2 = new Subscriber("Parth");
        Observer s3 = new Subscriber("Naveen");
        Observer s4 = new Subscriber("Utkarsh");
        Observer s5 = new Subscriber("Priti");

        subscription(raghav,s1);
        subscription(raghav,s2);
        subscription(raghav,s3);
        subscription(raghav,s4);
        subscription(raghav,s5);

        raghav.upload("Golang");
    }
}
