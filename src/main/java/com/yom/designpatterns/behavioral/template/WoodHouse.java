package com.yom.designpatterns.behavioral.template;

/**
 * Created by yogendra on 18/3/18.
 */
public class WoodHouse extends HouseTemplate{

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars for Wood House");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Building Walls for Wood House");
    }
}
