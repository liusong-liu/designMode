package com.yun.designMode.controller.singleton;

import lombok.Synchronized;

public class LazyPresident {
    private static volatile LazyPresident instance = null; //保证线程中同步
    //避免被实例化
    private LazyPresident(){
        System.out.println("生成一个新总统！");
    }

    public static synchronized LazyPresident getInstance(){
        if(instance==null){
            instance = new LazyPresident();
        }else{
            System.out.println("已经存在一个总统！");
        }
        return instance;
    }

    public void getName(){
        System.out.println("我是总统：");
    }
}
