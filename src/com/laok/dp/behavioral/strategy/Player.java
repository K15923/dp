package com.laok.dp.behavioral.strategy;

/**
 * 选手
 *
 * @author k 2022/8/27 0:35
 */
public class Player {

    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHead();
    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", wincount=" + wincount +
                ", losecount=" + losecount +
                ", gamecount=" + gamecount +
                '}';
    }
}
