package com.laok.dp.behavioral.visitor;

/**
 * @author k 2022/8/28 0:11
 */
public abstract class Visitor {

    abstract void visit(File file);

    abstract void visit(Dictory dictory);

}
