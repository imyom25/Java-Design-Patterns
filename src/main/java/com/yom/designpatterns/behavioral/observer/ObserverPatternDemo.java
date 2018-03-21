package com.yom.designpatterns.behavioral.observer;

/**
 * Created by yogendra on 9/3/18.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        FacebookPost facebookPost = new FacebookPost();

        Observer avinash = new FacebookFriend("Avinash");
        Observer maggi = new FacebookFriend("maggi");
        Observer nana = new FacebookFriend("nana");

        facebookPost.registerAsFriend(avinash);
        facebookPost.registerAsFriend(maggi);
        facebookPost.registerAsFriend(nana);

        avinash.setSubject(facebookPost);
        maggi.setSubject(facebookPost);
        nana.setSubject(facebookPost);

        //Check before Post made
        maggi.update();

        //Post made now
        facebookPost.postComment("Hello Guys!!! How are you???");

        //One Observer unregisters itself
        facebookPost.unregisterFromFriend(maggi);

        //New Post Made with only 2 Observers now
        facebookPost.postComment("Seems like someone gone");



    }
}
