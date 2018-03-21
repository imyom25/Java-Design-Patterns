package com.yom.designpatterns.behavioral.observer;


/**
 * Created by yogendra on 8/3/18.
 */
public interface Subject {

    void registerAsFriend(Observer friendRequest);

    void unregisterFromFriend(Observer friendRequest);

    void notifyFacebookFriends();

    Object getUpdate(Observer observer);

}
