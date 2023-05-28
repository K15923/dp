package com.laok.dp.structural.decorator.old;

/**
 * @author k 2022/8/17 11:28
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratedShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
