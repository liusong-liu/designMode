package com.yun.designMode.controller.singleton;

/**
 * 饿汉式-单例
 * @author lius
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }


}
