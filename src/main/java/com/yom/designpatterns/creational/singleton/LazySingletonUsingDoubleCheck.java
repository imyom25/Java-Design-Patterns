package com.yom.designpatterns.creational.singleton;

/**
 *Use this approach if the Singleton has to perform resource/time expensive stuff on instantiation during startup of
 * an application, e.g. booting of app server.
 */
public class LazySingletonUsingDoubleCheck {

    private volatile static LazySingletonUsingDoubleCheck LAZY_INSTANCE_WITH_DOUBLE_CHECK;

    private LazySingletonUsingDoubleCheck(){

    }

    public static LazySingletonUsingDoubleCheck getInstance(){

        if(LAZY_INSTANCE_WITH_DOUBLE_CHECK == null){


            synchronized (LazySingletonUsingDoubleCheck.class){
                if(LAZY_INSTANCE_WITH_DOUBLE_CHECK == null){
                    LAZY_INSTANCE_WITH_DOUBLE_CHECK = new LazySingletonUsingDoubleCheck();
                }
            }
        }
        return LAZY_INSTANCE_WITH_DOUBLE_CHECK;
    }
}
