package com.yun.designMode.controller.singleton;

import lombok.Synchronized;

/**
 * 单例模式测试
 * @author lius
 */
public class SingletonLazy {

    public static void main(String[] args) {
        President president = President.getInstance();
        president.getName();
        President president1 = President.getInstance();
        president1.getName();
        if(president==president1){
            System.out.println("是同一个人！");
        }else{
            System.out.println("不是同一个人！");
        }
    }
    static class President{
        private static volatile President instance = null;
        //避免被外部实例化
        private President(){
            System.out.println("产生一个总统！");
        }

        public static synchronized President getInstance() {
            if(instance==null){
                instance = new President();
            }else{
                System.out.println("已经有一个总统了！");
            }
            return instance;
        }

        public void getName(){
            System.out.println("美国总统: 拜登");
        }
    }
}

