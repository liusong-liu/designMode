package com.yun.designMode.controller.strategy;

import com.yun.designMode.controller.strategy.model.Food;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private MakeFood makeFood;

    public MakeFood getMakeFood() {
        return makeFood;
    }

    public void setMakeFood(MakeFood makeFood) {
        this.makeFood = makeFood;
    }

    public void order(String food, String ingredients){
        if(makeFood.isMe(food)){
            Food cooding = makeFood.cooding(ingredients);
            System.out.println("cooding = " + cooding.toString());
        }
    }
}
