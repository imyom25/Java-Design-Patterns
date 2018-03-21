package com.yom.designpatterns.behavioral.state;

/**
 * Created by yogendra on 18/3/18.
 */
public class TvContext implements State {


    private State tvState;

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    @Override
    public void doAction() {
            this.tvState.doAction();
    }
}
