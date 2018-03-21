package com.yom.designpatterns.behavioral.observer;

/**
 * Created by yogendra on 9/3/18.
 */
public interface Observer {

    void update();

    void setSubject(Subject subject);
}
