package com.yom.designpatterns.behavioral.state;

/**
 * Created by yogendra on 18/3/18.
 */
public class TvStartState implements State {

    @Override
    public void doAction() {
        System.out.println("Tv is ON now");
    }
}
