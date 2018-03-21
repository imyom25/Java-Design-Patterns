package com.yom.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by yogendra on 19/3/18.
 */
public class ShoppingCart {

    private List<Item> items;


    public ShoppingCart() {
        this.items = new ArrayList<>();
    }


    public void addItem(Item item){
         items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public void checkout(PaymentStrategy paymentStrategy){
        int totalAmount = calculateTotal();
        paymentStrategy.pay(totalAmount);
    }

    private int calculateTotal() {

        return items.stream().mapToInt(item -> item.getCost()).reduce(0,Integer::sum);
    }
}
