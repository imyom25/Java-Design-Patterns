package com.yom.designpatterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by yogendra on 19/3/18.
 */
@Setter
@Getter
public class Item {

    private String itemCode;
    private int cost;

    public Item(String itemCode, int cost) {
        this.itemCode = itemCode;
        this.cost = cost;
    }
}
