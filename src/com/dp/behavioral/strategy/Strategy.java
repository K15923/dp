package com.dp.behavioral.strategy;

/**
 * 出拳的策略
 *
 * @author k 2022/8/27 0:32
 */
public interface Strategy {
    Hand nextHead();

    void study(boolean win);

}
