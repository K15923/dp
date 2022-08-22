package com.dp.other;

/**
 * @author k 2022/8/19 1:44
 */
public abstract class AShape {

    protected Shape shape;

    public AShape(Shape shape) {
        this.shape = shape;
    }

    void setShape() {
        shape.brand();
    }

}
