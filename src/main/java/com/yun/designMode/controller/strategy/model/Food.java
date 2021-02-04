package com.yun.designMode.controller.strategy.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 食物
 */
@Data
public class Food implements Serializable {

    /**
     * 食物名称
     */
    private String name;
    /**
     * 食材
     */
    private String Ingredients;

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", Ingredients='" + Ingredients + '\'' +
                '}';
    }
}
