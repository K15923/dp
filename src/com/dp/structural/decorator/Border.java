package com.dp.structural.decorator;

/**
 * @author k 2022/8/27 23:16
 */
public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
