package com.yom.designpatterns.creational.singleton;

/**
 * Use this approach if the Singleton has to perform resource/time expensive stuff on instantiation during startup of
 * an application, e.g. booting of app server
 */
public class LazySingletonUsingSynchronizedMethod {

    private static LazySingletonUsingSynchronizedMethod LAZY_INSTANCE_WITH_SYNCHRONIZED;

    private LazySingletonUsingSynchronizedMethod(){

    }

    public synchronized static LazySingletonUsingSynchronizedMethod getInstance(){

        if(LAZY_INSTANCE_WITH_SYNCHRONIZED == null){
                    LAZY_INSTANCE_WITH_SYNCHRONIZED = new LazySingletonUsingSynchronizedMethod();
        }
        return LAZY_INSTANCE_WITH_SYNCHRONIZED;
    }
}
