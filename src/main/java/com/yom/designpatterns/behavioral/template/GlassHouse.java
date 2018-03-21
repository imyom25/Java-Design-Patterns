package com.yom.designpatterns.behavioral.template;

/**
 * Created by yogendra on 18/3/18.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars for Glass House");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Walls for Glass House");
    }
}
