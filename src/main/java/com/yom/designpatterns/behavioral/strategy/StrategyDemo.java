package com.yom.designpatterns.behavioral.strategy;

/**
 * Created by yogendra on 19/3/18.
 */
public class StrategyDemo {

    public static void main(String[] args) {

        ShoppingCart shoppingCart1 = new ShoppingCart();

        Item item1 = new Item("A123", 50);
        Item item2 = new Item("B456", 30);

        shoppingCart1.addItem(item1);
        shoppingCart1.addItem(item2);

        shoppingCart1.checkout(new UpiPaymentStrategy("upi@upi.com"));

        ShoppingCart shoppingCart2 = new ShoppingCart();

        Item item3 = new Item("C789", 40);
        Item item4 = new Item("D456", 60);

        shoppingCart2.addItem(item3);
        shoppingCart2.addItem(item4);

        shoppingCart2.checkout(new CardPaymentStrategy("VISA card"));



    }
}
