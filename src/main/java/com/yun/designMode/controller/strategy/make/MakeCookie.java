package com.yun.designMode.controller.strategy.make;

import com.yun.designMode.controller.strategy.MakeFood;
import com.yun.designMode.controller.strategy.model.Cookie;
import com.yun.designMode.controller.strategy.model.Food;

/**
 * 制作饼干
 */
public class MakeCookie implements MakeFood {

    private static final String FOOD = "cookie";
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
        Cookie cookie = new Cookie();
        cookie.setName("饼干");
        cookie.setIngredients(Ingredients);
        return cookie;
    }
}
