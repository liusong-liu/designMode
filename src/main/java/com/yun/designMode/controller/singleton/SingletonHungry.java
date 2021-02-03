package com.yun.designMode.controller.singleton;

/**
 * 饿汉总统
 */
public class SingletonHungry {

    public static void main(String[] args) {
        PresidentHungry president = PresidentHungry.getInstance();
        president.getName();
        PresidentHungry president1 = PresidentHungry.getInstance();
        president1.getName();
        if(president==president1){
            System.out.println("是同一个人！");
        }else{
            System.out.println("不是同一个人");
        }
    }

    /**
     * 饿汉总统
     */
    static class PresidentHungry{
        //初始化总统对象
        private static PresidentHungry instance = new PresidentHungry();
        //防止被外部实例化
        private PresidentHungry(){
            System.out.println("生成一个总统！");
        }
        //对外只暴露获取接口
        public static PresidentHungry getInstance(){
            return instance;
        }
        public void getName(){
            System.out.println("总统名字：拜登！");
        }
    }
}
