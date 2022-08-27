package com.dp.behavioral.strategy;

import java.util.Random;

/**
 * 获胜之后的策略
 *
 * @author k 2022/8/27 0:33
 */
public class WinnerStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHead() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
