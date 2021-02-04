package com.yun.designMode.controller.strategy.make;

import com.yun.designMode.controller.strategy.MakeFood;
import com.yun.designMode.controller.strategy.model.Food;
import com.yun.designMode.controller.strategy.model.IceCream;

public class MakeIceCream implements MakeFood {
    private static final String FOOD = "ice cream";
    /**
     * 判断是否需要我制作
     *
     * @param food
     * @return
     */
    @Override
    public boolean isMe(String food) {
        return FOOD.equals(food);
    }

    /**
     * 制造中
     *
     * @param Ingredients
     * @return
     */
    @Override
    public Food cooding(String Ingredients) {
        System.out.println("食材是：Ingredients = " + Ingredients);
        IceCream iceCream = new IceCream();
        iceCream.setName("冰淇淋");
        iceCream.setIngredients(Ingredients);
        return iceCream;
    }
}
