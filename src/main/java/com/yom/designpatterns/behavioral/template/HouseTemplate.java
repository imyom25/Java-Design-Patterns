package com.yom.designpatterns.behavioral.template;

/**
 * Created by yogendra on 18/3/18.
 */
public abstract class HouseTemplate {

    public final void  buildHouse(){

        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is Built");
    }

    private void buildWindows() {

        System.out.println("Building Windows");
    }

    protected abstract void buildPillars();

    protected abstract void buildWalls();

    private void buildFoundation() {
        System.out.println("Building Foundations");
    }
}
