package com.yom.designpatterns.behavioral.state;

/**
 * Created by yogendra on 19/3/18.
 */
public class StateDemo {

    public static void main(String[] args) {

        TvContext context = new TvContext();
        TvStartState tvStartState = new TvStartState();
        TvStopState tvStopState = new TvStopState();

        context.setTvState(tvStartState);
        context.doAction();

        context.setTvState(tvStopState);
        context.doAction();


    }
}
