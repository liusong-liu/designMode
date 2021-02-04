package com.yun.designMode.controller.strategy;

import com.yun.designMode.controller.strategy.model.Food;

/**
 * 制作食物
 */
public interface MakeFood {

    /**
     * 判断是否需要我制作
     * @param food
     * @return
     */
    public boolean isMe(String food);

    /**
     * 制造中
     * @param Ingredients
     * @return
     */
    public Food cooding(String Ingredients);
}
