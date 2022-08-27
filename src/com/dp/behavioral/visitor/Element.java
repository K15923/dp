package com.dp.behavioral.visitor;

/**
 * @author k 2022/8/28 0:12
 */
public interface Element {
    void accept(Visitor visitor);
}
