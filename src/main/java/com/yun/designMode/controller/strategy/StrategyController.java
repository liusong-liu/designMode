package com.yun.designMode.controller.strategy;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.yun.designMode.controller.strategy.make.MakeCookie;
import com.yun.designMode.controller.strategy.make.MakeIceCream;
import com.yun.designMode.controller.strategy.model.Food;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 准备点餐
 */
public class StrategyController {

//    @Autowired
//    private static Order order;

    public static void main(String[] args) {
        String food = "cookie";
        String ingredients = "鸡蛋";
        Order order = new Order();
        MakeCookie makeCookie = new MakeCookie();
        order.setMakeFood(makeCookie);
        order.order(food, ingredients);
        food = "ice cream";
        MakeIceCream makeIceCream = new MakeIceCream();
        order.setMakeFood(makeIceCream);
        order.order(food, ingredients);
    }

}
