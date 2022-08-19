package com.dp.structural.Bridge;

/**
 * @author k 2022/8/18 21:42
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}