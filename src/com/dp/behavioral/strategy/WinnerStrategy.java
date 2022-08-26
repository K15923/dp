package com.dp.behavioral.strategy;

/**
 * 获胜之后的策略
 *
 * @author k 2022/8/27 0:33
 */
public class WinnerStrategy implements Strategy{
    @Override
    public Hand nextHead() {
        return null;
    }

    @Override
    public void study(boolean win) {

    }
}
