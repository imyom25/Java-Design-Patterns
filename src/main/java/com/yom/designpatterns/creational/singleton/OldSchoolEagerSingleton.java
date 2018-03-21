package com.yom.designpatterns.creational.singleton;

/**
 * This type of singleton object creation is used most of the time if enum based approach is not used.
 * NOTE :- If the Singleton has to perform any resource/time expensive stuff on instantiation during startup of
 * an application (e.g. booting of app server),  consider using a lazy Singleton instead.
 *
 */
public class OldSchoolEagerSingleton {

    private static final OldSchoolEagerSingleton EAGER_SINGLETON = new OldSchoolEagerSingleton();

    private OldSchoolEagerSingleton() {
    }

    public static OldSchoolEagerSingleton getInstance(){
        return EAGER_SINGLETON;
    }

}
