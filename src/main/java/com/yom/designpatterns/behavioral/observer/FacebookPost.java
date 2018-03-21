package com.yom.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yogendra on 9/3/18.
 */
public class FacebookPost implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String comment;

    @Override
    public void registerAsFriend(Observer friendRequest) {
        observers.add(friendRequest);
    }

    @Override
    public void unregisterFromFriend(Observer friendRequest) {
        observers.remove(friendRequest);
    }

    @Override
    public void notifyFacebookFriends() {

        observers.stream().forEach(obj->obj.update());
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.comment;
    }


    public void postComment(String comment){
        System.out.println("comment added to post "+comment);
        this.comment= comment;
        notifyFacebookFriends();
    }
}
