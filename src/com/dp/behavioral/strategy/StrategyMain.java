package com.dp.behavioral.strategy;

/**
 * @author k 2022/8/27 0:36
 */
public class StrategyMain {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage :java Main randomseed 1  randomseed 2");
            System.out.println("Example : java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player zs = new Player("zs", new WinnerStrategy(seed1));
        Player ls = new Player("ls", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand hand1 = zs.nextHand();
            Hand hand2 = ls.nextHand();
            if (hand1.isStrongerThan(hand2)) {
                System.out.println("winner: " + zs);
                zs.win();
                ls.lose();
            } else if (hand1.isWeakerThan(hand2)) {
                System.out.println("winner: " + ls);
                ls.win();
                zs.lose();
            } else {
                System.out.println("even...");
                zs.even();
                ls.even();
            }

        }
        System.out.println("Total result:");
        System.out.println(zs.toString());
        System.out.println(ls.toString());

    }
}
