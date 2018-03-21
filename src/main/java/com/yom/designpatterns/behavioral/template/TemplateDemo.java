package com.yom.designpatterns.behavioral.template;

/**
 * Created by yogendra on 18/3/18.
 */
public class TemplateDemo {

    public static void main(String[] args) {

        HouseTemplate woodHouse =  new WoodHouse();
        woodHouse.buildHouse();

        System.out.println("##############################");

        HouseTemplate glassHouse =  new GlassHouse();
        glassHouse.buildHouse();

    }
}
