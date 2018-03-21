package com.yom.designpatterns.creational.singleton;

/**
 *  Validating the Singleton Instances
 */
public class MainApplication {


    public static void main(String[] args) {

        SingletonUsingEnum instance1 = SingletonUsingEnum.SINGLE_INSTANCE;
        SingletonUsingEnum instance2 = SingletonUsingEnum.SINGLE_INSTANCE;
        System.out.println("instance1 " + instance1);
        System.out.println("instance2 " + instance2);

        OldSchoolEagerSingleton oldSchoolEagerSingleton1 = OldSchoolEagerSingleton.getInstance();
        OldSchoolEagerSingleton oldSchoolEagerSingleton2 = OldSchoolEagerSingleton.getInstance();
        System.out.println("oldSchoolEagerSingleton1 " + oldSchoolEagerSingleton1);
        System.out.println("oldSchoolEagerSingleton2 " + oldSchoolEagerSingleton2);

        LazySingletonUsingDoubleCheck lazySingletonUsingDoubleCheck1 = LazySingletonUsingDoubleCheck.getInstance();
        LazySingletonUsingDoubleCheck lazySingletonUsingDoubleCheck2 = LazySingletonUsingDoubleCheck.getInstance();
        System.out.println("lazySingletonUsingDoubleCheck1 " + lazySingletonUsingDoubleCheck1);
        System.out.println("lazySingletonUsingDoubleCheck2 " + lazySingletonUsingDoubleCheck2);

        LazySingletonUsingSynchronizedMethod lazySingletonUsingSynchronizedMethod1 = LazySingletonUsingSynchronizedMethod.getInstance();
        LazySingletonUsingSynchronizedMethod lazySingletonUsingSynchronizedMethod2 = LazySingletonUsingSynchronizedMethod.getInstance();
        System.out.println("lazySingletonUsingSynchronizedMethod1 " + lazySingletonUsingSynchronizedMethod1);
        System.out.println("lazySingletonUsingSynchronizedMethod2 " + lazySingletonUsingSynchronizedMethod2);


    }

}
